import React,{Component } from 'react'
import Axios from 'axios';
  export default class Login extends Component {
    
                constructor(props){
                    super(props);

                    this.state = {
                         id:'',
                         password:''
                      }
                      //this.Authenticate=this.Authenticate.bind(this);
                }


                Authenticate=(event)=>{
                    event.preventDefault();
                    debugger;
                    console.log(this.state.username)
                    console.log(this.state.password)
                   
                    Axios.post("http://localhost/emp-springrest/loginPage/login",null,
                       {
                        params:{
                        id:this.state.id,
                        password:this.state.password
                       }
                    }).then((response)=>{
                        console.log('response',response); 
                        if(response.data.msg==="Succesfull"){
                             this.props.history.push('/home'); 
                             localStorage.setItem('loginData',JSON.stringify(response.data));
                             let dd = JSON.parse(localStorage.getItem('loginData'));
                             console.log('DDDD',dd)
                        }
                        else{
                            this.props.history.push('/'); 
                        }    
                    }).catch((error)=>{
                        console.log('error',error);     
                    });
                }

                createAccount=(event)=>{
                    this.props.history.push('/createAccount');  
                }

    
    render() {
          return (
                <div>
                <form onSubmit={this.Authenticate} method="post"> 
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-heading">
                            <h2 class="text-center">Employee Login</h2>
                        </div>
                        <hr/>
                        <div class="modal-body">
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-user"></span>
                                        </span>
                                        <input
                                           onChange={(event)=>{
                                            this.setState({id:event.target.value})
                                        }} 
                                        type="text" name="id" class="form-control" placeholder="Emp Id"
                                         value={this.state.id}/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-lock"></span>
                                        </span>
                                        <input
                                          onChange={(event)=>{
                                            this.setState({password:event.target.value})
                                        }}
                                         type="password" name="password" class="form-control" placeholder="Password"
                                         value={this.state.password}/>
            
                                    </div>
            
                                </div>
            
                                <div class="form-group text-center">
                                    <button type="submit" class="btn btn-success btn-lg">Login</button>
                                   
                                </div>
                               
            
                            
                        </div>
                    </div>
                </div>

            </form>
             <div class="form-group text-center">
             <button type="submit" onClick={this.createAccount} class="btn btn-success btn-lg">Create Account</button>&nbsp;&nbsp;
             <button type="reset" class="btn btn-success btn-lg">Forgot Password</button>
         </div>
         <div class="form-group text-center">
             
         </div> 
         </div>
          )
      }
  }
  