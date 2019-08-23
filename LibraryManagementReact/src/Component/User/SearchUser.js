import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
export default class SearchUser extends Component {

            constructor(props){
                super(props);

            }

            UserHomePage=()=>{
                this.props.history.push('/home'); 
            }
            
            logout=()=>{
               this.props.history.push('/');
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
            <Link onClick={this.UserHomePage} style={{float: 'right'}} href="#">Home</Link>
            <Link onClick={this.logout} style={{float: 'right'}} href="#">logout</Link>
          </div></nav>
        <div className="container-fluid">
          <div className="row">    
            
            <div id="admin-main-control" className="col-md-10 p-x-3 p-y-1">
              <div style={{float: 'right', margin: '20px'}}>
                <div>
                  <form className="form-inline my-2 my-lg-0">
                    <label htmlFor="inputState">Book</label>
                    <select style={{margin: '20px'}} id="inputState" className="form-control">
                      <option selected>Choose...</option>
                      <option>BookName</option>
                      <option>Author</option>
                      <option>Category</option>
                    </select>
                    <input className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
                    <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                  </form>
                </div>
              </div>
              <div className="content-title m-x-auto">
                <i className="fa fa-dashboard" /> Dashboard
                <div>
                <div>
                
                <table class="table table-dark">
               
  <thead>
  <h1>Available Books</h1> 
    <tr>
      <th scope="col">BookId</th>
      <th scope="col">bookname</th>
      <th scope="col">Categeory</th>
      <th scope="col">Author </th>
      <th scope="col">Language</th>
      <th scope="col">Request</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
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
