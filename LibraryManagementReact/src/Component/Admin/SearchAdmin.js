import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios';
export default class SearchAdmin extends Component {

      constructor(props){
           super(props);

           this.state = {
            UserData:[],
            id:'',
            email:'',
            name:'',
            password:'',
            phone:'',
            useType:'',
            searchName:''
         }
           
      }

      logout=()=>{
        debugger;
          this.props.history.push('/'); 
        }

        AdminHomePage=()=>{
          this.props.history.push('/homeAdmin'); 
      }
       
       componentDidMount(){
         this.getUserName();
       }
         
       getUserName=()=>{
                    
        Axios.get('http://localhost:8080/getUserByName'+'?'+'name='+this.props.history.location.state.detail)
        .then((response) => {
          
          let fetchedUser = []; //array 

          for (let key in response.data.userList) {

            //console.log(response.data[key])
  
            fetchedUser.push({
              ...response.data.userList[key],
            
            })
            //concate two Object using 
  
          }
          this.setState({
            UserData: fetchedUser

          }) 

          console.log('response', this.state.UserData);

        }).catch((error)=>{
           
        })
      }


      deleteUser=(user)=>{
        debugger;
        console.log('delete',user)
        Axios.get('http://localhost:8080/deleteUser'+'?'+'id='+user.id)
        .then((response)=>{
           console.log("response",response)
           alert("deleted Succesfully")
           window.location.reload(); 
        }).catch((error)=>{
            console.log('error',error)
        })

      }



      SerachPageAdmin=()=>{
        debugger;
         console.log("searchName",this.state.searchName);
         this.props.history.push({
           pathname: '/SearchAdmin',
           state: { detail: this.state.searchName }
         })
      }




    render() {
        return (
            <div>
                 <div>
        <nav id="nav" className="navbar navbar-inverse navbar navbar-dark bg-dark">
          <div className="container-fluid">
            <div className="navbar-header">
              <a className="navbar-brand" href="#">Library Management System</a>
            </div>

            <Link onClick={this.logout} style={{float: 'right',margin:'20px'}} href="#">logout</Link>
            <Link onClick={this.AdminHomePage} style={{float: 'right',margin:'20px'}} href="#">Home</Link>
          </div></nav>
        <div className="container-fluid">
          <div className="row">    
            
            <div id="admin-main-control" className="col-md-10 p-x-3 p-y-1">
              <div style={{float: 'right', margin: '20px'}}>
                <div>
                  <form className="form-inline my-2 my-lg-0">
                    <label htmlFor="inputState">Search User</label>
                    
                    <input  value={this.state.searchName} onChange={(event)=>{
                                            this.setState({searchName:event.target.value})
                                        }} 
                    value={this.state.searchName} 
                    className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
                    <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                  </form>
                </div>
              </div>
              <div className="content-title m-x-auto">
                <i className="fa fa-dashboard" /> Admin Search
                <div>
                <div>
                
                <table class="table table-dark">
               
  <thead>
  <h1>Search User Detail</h1> 
  <tr>
      <th scope="col">UserEmail</th>
      <th scope="col">Username</th>
      <th scope="col">Categeory</th>
      <th scope="col">....</th>
      <th scope="col">Update</th>
      <th scope="col">Delete</th>
      
    </tr>
  </thead>
  <tbody>
  {
      this.state.UserData.map((user)=>{
         console.log('tabledate',user.id)
        return (
    <tr>
        
      <th scope="row">{user.id}</th>
      <td>{user.name}</td>
      <td>{user.phone}</td>
      <td>{user.email}</td>
      <td>{user.useType}</td>
      <td><button type="button" class="btn btn-success"  >Update</button></td>
      <td><button onClick={this.deleteUser.bind(this,user)} type="button" class="btn btn-danger">Delete</button></td>
      
    </tr> 
        )
    })
    }   
  </tbody>
</table>
            </div>
                
                 </div>
              </div>
            </div> {/* /#admin-main-control */}
          </div> {/* /.row */}
        </div> {/* /.container-fluid */}
      </div>
            </div>
        )
    }
}
