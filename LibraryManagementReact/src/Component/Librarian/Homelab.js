import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import BorrowTable from '../Login/BorrowTable';
import Test from './Test';
import InsertBook from '../InsertBook';
import Axios from 'axios';
export default class Homelab extends Component {
  constructor(props){
    super(props)
     
   this.showLo = this.showLo.bind(this)
    this.state = {
      show : false,
      bookid: '',
     bookname: '',
    author: '',
    categeory: '',
   language: '',
   noofCopies: '',
   price: '',
   searchBy:'',
   searchInput:'',
   BookData:[],
   

    }
  }
  showLo(e){
    e.preventDefault();

      this.setState.tableName="Search Book"
     let search;
       
      console.log('searchtype',this.state.searchBy)
      console.log('searchtype',this.state.searchInput)
        if(this.state.searchBy==='BookName'){
            search='getBookByName';
        }
        else if(this.state.searchBy==='Author'){
          search='getBookByAuthor';
        }
        else{
            search='getBookByCategory';
        }
          let fetchedBook = []; //array 
        Axios.get('http://localhost:8080/'+search+'?'+this.state.searchBy+'='+this.state.searchInput)
        .then((response) => {
          console.log(response)
         
          if(response.data.code==201){
            console.log("Daata Found ...");
            for (let key in response.data.bookList) {
    
              //console.log(response.data[key])
      
              fetchedBook.push({
                ...response.data.bookList[key],
              
              })
              //concate two Object using 
      
            }
            this.setState({
              BookData: fetchedBook
      
            }) 
            this.setState({
              show : true
            }
            
            )

          } 
          else {
            console.log("Data Not Found ...");
            this.setState({
              show : false
            }
            
            )
           
          }
          console.log('response', this.state.BookData);
            
        }).catch((error)=>{
         
         
    
        })
     
     
    // this.props.history.push('/lo')

  }

  insertBook=()=>{
    this.props.history.push('/insertBook');
  }

 

    
  logout=(e)=>{
    debugger;
      
      this.props.history.push('/'); 
    }


    getAllBooks=()=>{

      //
       this.setState.tableName="All Books"
      let fetchedBook = []; //array 
      Axios.get('http://localhost:8080/getAllBook')
      .then((response) => {
        console.log(response)
       
        if(response.data.code==201){
          console.log("Daata Found ...");
          for (let key in response.data.bookList) {
  
            //console.log(response.data[key])
    
            fetchedBook.push({
              ...response.data.bookList[key],
            
            })
            //concate two Object using 
    
          }
          this.setState({
            BookData: fetchedBook
    
          }) 
          this.setState({
            show : true
          }
          
          )

        } 
        else {
          console.log("Data Not Found ...");
          this.setState({
            show : false
          }
          
          )
         
        }
        console.log('response', this.state.BookData);
          
      }).catch((error)=>{
       
       
  
      })

    }


    deleteBook=(book)=>{
      debugger;
      console.log('delete',book)
      Axios.get('http://localhost:8080/deleteBook'+'?'+'id='+book.bookid)
      .then((response)=>{
         console.log("response",response)
         alert("deleted Succesfully")
         window.location.reload(); 
      }).catch((error)=>{
          console.log('error',error)
      })

    }



    render() {
        return (
          <Router>
            
            <div>
                 <div>
        <nav id="nav" className="navbar navbar-inverse navbar navbar-dark bg-dark">
          <div className="container-fluid">
            <div className="navbar-header">
              <a className="navbar-brand" href="#">Library Management System</a>
            </div>
            <Link onClick={this.logout} style={{float: 'right'}} href="#">logout</Link>
          </div></nav>
        <div className="container-fluid">
          <div className="row">    
            <div id="admin-sidebar" className="col-md-2 p-x-0 p-y-3">
              <ul id='list' className="sidenav admin-sidenav list-unstyled">
                <li style={{color:'white'}} onClick={this.insertBook} >InsertBook</li>
                <li><Link to="/returnBook">Accept Return Book</Link></li>
                <li><Link to="/userRequest">User Request</Link></li>
                <li><Link >AllotBook </Link></li>
                
              </ul>
            </div> {/* /#admin-sidebar */}
            <div id="admin-main-control" className="col-md-10 p-x-3 p-y-1">
              <div style={{float: 'right', margin: '20px'}}>
                <div>
                  <form onSubmit={this.showLo} className="form-inline my-2 my-lg-0">
                    <label htmlFor="inputState">Book</label>
                    <select
                     value={this.state.searchBy}
                     onChange={(event)=>{
                      this.setState({searchBy:event.target.value})
                  }} style={{margin: '20px'}} id="inputState" className="form-control">
                      <option   selected>Choose...</option>
                      <option>BookName</option>
                      <option>Author</option>
                      <option>Category</option>
                    </select>
                    <input   value={this.state.searchInput}
                    onChange={(event)=>{
                     this.setState({searchInput:event.target.value})
                 }}
                     className="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
                    <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                  </form>
                </div>
              </div>
              <div className="content-title m-x-auto">
                <i className="fa fa-dashboard" /> librarian
                <div>
                <br></br>
                <br></br>
                <button className="btn btn-primary" onClick={this.getAllBooks}>All-Books</button>
                
            </div>
              {this.state.show ? <div>
              
                <table class="table table-dark">
                {
                  //console.log("BookData table ",this.state.BookData.length)
                  }
                 <thead>
                 <h1>{tableName}</h1> 
                   <tr>
                     <th scope="col">Bookid</th>
                     <th scope="col">Bookname</th>
                     <th scope="col">Author</th>
                     <th scope="col">Category</th>
                     <th scope="col">Language</th>
                     <th scope="col">NoofCopies</th>
                     <th scope="col">Update</th>
                     <th scope="col">Delete</th>
                     
                   </tr>
                 </thead>
                 {
                     this.state.BookData.map((book)=>{
                       console.log("***********");
                       console.log(this.state.BookData);
                       console.log("***********");
                       console.log('length',this.state.BookData.length)
                       return (
                 <tbody>
                
                   <tr>
                       
                     <th scope="row">{book.bookid}</th>
                     <td>{book.bookname}</td>
                     <td>{book.author}</td>
                     <td>{book.categeory}</td>
                     <td>{book.language}</td>
                     <td>{book.noofCopies}</td>
                     <td><button type="button" class="btn btn-success"  >Update</button></td>
                     <td><button onClick={this.deleteBook.bind(this,book)} type="button" class="btn btn-danger">Delete</button></td>
                     
                   </tr> 
                      
                 </tbody>
                 )
                })
                } 
               </table>


              </div>:null}
              </div>
            </div> {/* /#admin-main-control */}
          </div> {/* /.row */}
        </div> {/* /.container-fluid */}
      </div>
            </div>
      
            </Router>
        )
    }
}
