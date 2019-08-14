import React, { Component } from 'react'
import Axios from 'axios';
import { thisExpression } from '@babel/types';

export class CreateAccount extends Component {
                
               constructor(props){
                 super(props);
                 this.state ={
                     name :'',
                     email:'',
                     phone:'',
                     password:''
                 }
                 this.postData=this.postData.bind(this);  //bind the method
                 this.validateUser=this.validateUser.bind(this);
                 
               }
                 // validate User
                validateUser(event){
                    var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
                    var passw=  /^[A-Za-z]\w{7,14}$/;
                    event.preventDefault();
                    debugger
                     if(this.state.name.trim()!==''&& this.state.email.trim()!==''
                        && this.state.phone.trim()!=='' &&this.state.password.trim()!==''
                        && re.test(this.state.email) && this.state.phone.length===10){
                            this.postData(event);
                            alert("Data is saved ");
                     }
                     else{
                         alert("please complete the field data first");
                     }

                }

                postData(event){
                      event.preventDefault(); // to prevent refrest the page
                      console.log('post Data',this.state);
                      let accountData =this.state;
                       // save data in firebase using api 
                      Axios.post('https://emp-app1-965fc.firebaseio.com/accounts.json'
                      ,accountData).then((response)=>{
                              console.log('response Object ',response)
                      }).catch((error)=>{
                         console.log('error',error)
                      })
                }
    
    
    render() {
        return (
            <div>
                <form onSubmit={this.validateUser} style={{marginTop:50,marginLeft:200,marginRight:200}}>
                    <div className="row">
                        <div class="col">
                            <input 
                            onChange={(event)=>{
                                this.setState({name:event.target.value})
                            }} 
                            value={this.state.name} type="text" className="form-control" placeholder="name"/>
    </div>
                            <div className="col">
                                <input
                                 onChange={(event)=>{
                                    this.setState({email:event.target.value})
                                }} 
                                value={this.state.email} type="text" className="form-control" placeholder="Email"/>
    </div>
                            </div>
                            <div className="row">
                        <div class="col">
                            <input
                              onChange={(event)=>{
                                this.setState({phone:event.target.value})
                            }} 
                            value={this.state.phone} type="number" className="form-control" placeholder="Phone"/>
    </div>
                            <div className="col">
                                <input
                                  onChange={(event)=>{
                                    this.setState({password:event.target.value})
                                }} 
                                 value={this.state.password} type="password" className="form-control" placeholder="Passsword"/>
    </div>
                            </div><br/><br/>
                            <button style={{marginLeft:500,marginTop:20}} className='"btn btn-primary'  type="submit">Create</button>  
</form>
                
                    </div>
                    )
                }
            }
            
            export default CreateAccount
