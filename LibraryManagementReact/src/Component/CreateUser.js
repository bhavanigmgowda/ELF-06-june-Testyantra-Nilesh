import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios';
export default class CreateUser extends Component {

        constructor(props){
           super();

           this.state = {
            id:'',
            email:'',
            name:'',
            password:'',
            phone:'',
            useType:''
         }

        }

        
        logout=()=>{
          this.props.history.push('/'); 
        }
      
        createUser=(event)=>{
          event.preventDefault();
          let UserData =this.state;
          console.log("UserData ",UserData);
 
          Axios.post('http://localhost:8080/createUser'
          ,UserData).then((response)=>{
                  console.log('response Object ',response)
                alert("Data is Saved");
                window.location.reload();  

          }).catch((error)=>{
             console.log('error',error)
             alert("Data is not Saved");
             window.location.reload(); 
          })


        }

        Home=()=>{
          debugger;
          this.props.history.push('/homeAdmin'); 
        }





    render() {
        return (
            <div>
              <nav id="nav" className="navbar navbar-inverse navbar navbar-dark bg-dark">
          <div className="container-fluid">
            <div className="navbar-header">
              <a className="navbar-brand" href="#">Library Management System</a>
            </div>
            <Link onClick={this.logout} style={{float: 'right',margin:'20px'}} href="#">logout</Link>
            <Link onClick={this.Home} style={{float: 'right',margin:'20px'}} href="#">Home</Link>
           
          </div></nav>

                 <form onSubmit={this.createUser} className="col-md-10 offset-1" style={{backgroundColor : '#bdcedf'}}>
        <h3 style={{textAlign: 'center', padding: '20px'}}>User Information</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">ID</label>
            <input required type="text" onChange={(event)=>{
                                            this.setState({id:event.target.value})
                                        }} 
              value={this.state.id} className="form-control" placeholder="Please Enter ID" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Name</label>
            <input required type="text" onChange={(event)=>{
                                            this.setState({name:event.target.value})
                                        }} 
              value={this.state.name}  className="form-control" placeholder="Please Enter your Name " />
          </div>
        </div>
        <div className="form-row">
        <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Email</label>
            <input type="text" onChange={(event)=>{
                                            this.setState({email:event.target.value})
                                        }}
            className="form-control" value={this.state.email}  placeholder="Enter the email" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Phone</label>
            <input type="text" onChange={(event)=>{
                                            this.setState({phone:event.target.value})
                                        }}
              value={this.state.phone}  className="form-control" placeholder="Please Enter your number " />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Password</label><br />
            <input type="text"  onChange={(event)=>{
                                            this.setState({password:event.target.value})
                                        }}
              value={this.state.password} className="form-control" placeholder="Please Enter Password" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Confirm Password password</label>
            <input type="text" 
             className="form-control" placeholder="Confirm Password" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">UserType</label><br />
            <select  value={this.state.useType}
                     onChange={(event)=>{
                      this.setState({useType:event.target.value})
                  }}       disabled=""
               style={{width: '640.75px', height: '24.99px'}}>
              <option    selected="selected">Please select</option>
              <option value="USER">User</option>
              <option value="Admin">Admin</option>
              <option value="Librarian">Librarian</option>
            </select>
          </div>
          <div>
          <button  style={{margin: '20px',float: 'right'}} className="btn btn-primary">Submit</button>
          <button  style={{ margin: '20px',float: 'right'}}  className="btn btn-primary" >Reset</button>
          
          </div>
        </div>

      
    
      </form>
            </div>
        )
    }
}
