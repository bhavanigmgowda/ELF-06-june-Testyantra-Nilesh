import React, { Component } from 'react'
import './login.css'
import Axios from 'axios';
export default class Login extends Component {   
  constructor(props){
    super(props);

    this.state = {
         id:'',
         password:'',
         show:false
      }
      //this.Authenticate=this.Authenticate.bind(this);
   }

   
         
   Authenticate=(event)=>{
    event.preventDefault();
     
     Axios.post("http://localhost:8080/login",null,
      {
        
          params:{
          id:this.state.id,
          password:this.state.password
          }  
      }

     ).then((response)=>{
        if(response.data.code===201){
       if(response.data.userList[0].useType==="Admin"){

      console.log("responser",response.data.userList[0].useType);
      console.log("responser",response.data);
         this.props.history.push('/homeAdmin');
        

       }
       else if(response.data.userList[0].useType==="Librarian"){
          this.props.history.push('/homeLibrarian');
      
         console.log("responser",response.data.userList[0].useType);
       }
       else{
         this.props.history.push('/home');
         console.log("responser",response.data.userList[0].useType);
        
       }
      }
      else{
        this.state.show=true;
        console.log(response.data.code)
         
      }

     }).catch((error)=>{
       console.log(error)
     })
    }



    render() {
        return (
            <div id="login">
              <div>
        {/*
    you can substitue the span of reauth email for a input with the email and
    include the remember me checkbox
    */}
        <nav className="navbar navbar-inverse">
          <div className="container-fluid">
            <div className="navbar-header">
              <a className="navbar-brand" href="#">Library Management System</a>
            </div>
          </div></nav>
        <div className="container">
          <div className="card card-container">
            {/* <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> */}
            <img id="profile-img" className="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
            <p id="profile-name" className="profile-name-card" />
            <form onSubmit={this.Authenticate} className="form-signin">
              <span id="reauth-email" className="reauth-email" />
              <input name='email'   onChange={(event)=>{
                                            this.setState({id:event.target.value})
                                        }}    
              type="text" value={this.state.id}  id="inputEmail" className="form-control" placeholder="Enter ID" required autofocus />
              <input name='password'  onChange={(event)=>{
                                            this.setState({password:event.target.value})
                                        }}
              type="password" value={this.state.password}  id="inputPassword" className="form-control" placeholder="Password" required />
              <div id="remember" className="checkbox">
              </div>
              <button className="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
            </form>{/* /form */}
            <a href="#" className="forgot-password">
              Forgot the password?
            </a>
            {this.state.show ?<div><h5 style={{color:'red'}}> Invalid UserName or Password</h5></div>:null}
            
          </div>{/* /card-container */}
        </div>{/* /container */}
      </div>

            </div>
        )
    }
}
