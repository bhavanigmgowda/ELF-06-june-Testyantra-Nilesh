import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
export default class SearchAdmin extends Component {
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
            <Link onClick={this.UserHomePage} style={{float: 'right',margin:'20px'}} href="#">Home</Link>
          </div></nav>
        <div className="container-fluid">
          <div className="row">    
            
            <div id="admin-main-control" className="col-md-10 p-x-3 p-y-1">
              <div style={{float: 'right', margin: '20px'}}>
                <div>
                  <form className="form-inline my-2 my-lg-0">
                    <label htmlFor="inputState">Search User</label>
                    
                    <input className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
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
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td><button type="button" class="btn btn-success"  >Update</button></td>
      <td><button  type="button" class="btn btn-danger">Delete</button></td>
    </tr>
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
