import React, { Component } from 'react'
import Axios from 'axios';
import './HomePage.css'
export default class HomePage extends Component {
      
           constructor(props){
               super();
               this.state={
                bean: JSON.parse(localStorage.getItem('loginData'))
               } 
               console.log("Bean",this.state.bean.data[0].name)

            

           }

           Logout=(event)=>{
            event.preventDefault();
              debugger;
            Axios.get("http://localhost/emp-springrest/loginPage/logout"
             ).then((response)=>{
             console.log('response',response); 
             this.props.history.push('/');        
         }).catch((error)=>{
             console.log('error',error);     
         });

           }
    
       
    render() {
        return (
     <body style={{backgroundColor : 'darkgray'}}>    
    <div >     
    <div>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="welcome">EmployeeManagement</a>
	
		<form class="form-inline my-2 my-lg-0" action="./search" method="post">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" name="id" aria-labelSearch/>
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>

		
       
      <button style={{margin: '20px'}} className=" btn btn-outline-primary">Update</button>
      <button  onClick={this.Logout} className=" btn btn-outline-primary">Logout</button>
	</nav>
    </div>
	
	<div class="container">
        <h3>Employee-Details</h3>
        <hr/>
        <label>Name :-{this.state.bean.data[0].name} </label><br/>
        <label>Age :- {this.state.bean.data[0].age}</label><br/>
        <label>Salary :-{this.state.bean.data[0].salary}</label><br/>
        <label>E-Mail :-{this.state.bean.data[0].email}</label><br/>
        <label>Designation :-{this.state.bean.data[0].designation}</label><br/>
        <label>Gender :-{this.state.bean.data[0].gender} </label><br/>
       
	</div>
    </div> 
    <footer id="sticky-footer" class="py-4 bg-dark text-white-50">
    <div class="container text-center">
      <small>Copyright &copy; Your Website</small>
    </div>
  </footer>
    </body>   
        )
    }
}
