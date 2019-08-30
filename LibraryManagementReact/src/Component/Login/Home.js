import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './Home.css'
import BorrowTable from './BorrowTable';
import Axios from 'axios';
export default class Home extends Component {
          constructor(props){
              super(props);
              this.state = {
                show : false,
                bookid: '',
               bookname: '',
              author: '',
              categeory: '',
             language: '',
             searchBy:'',
             searchInput:'',
             BookData:[],   
           
          }
          
          console.log("Home PAge")
          console.log("UserInfo",this.state.BookData)
         // console.log("UserId ="+this.state.userData)
         // console.log(this.userData);
        }

        

  
        searchBy=(e)=>{
          e.preventDefault();
      
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






        getAllBooks=()=>{

          //
    
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


          logout=()=>{
            this.props.history.push('/'); 
          }
      

            SearchPage=()=>{
                this.props.history.push('/SearchUser'); 
            }
    
            requestBook=(book)=>{
                debugger;
                console.log("boodid ="+book)
                 
                 
                  
                  var userdData=JSON.parse(localStorage.getItem('loginData'))
                  console.log("userdData ="+userdData)

               var requestBean={bookbean:book,
                                userbean:userdData.userList[0],
                                status:true
                              }
         

               console.log("RequestBean",requestBean);

              Axios.post('http://localhost:8080/getRequestfromUser'
               ,requestBean).then((response)=>{
                       console.log('response Object ',response)
                     alert("book Request is Send");
                    
     
               }).catch((error)=>{
                  console.log('error',error)
                  alert("Request is not send");
                  
               })  
     
               
            }
 

        componentDidMount=()=>{
          console.log("Home Did Mount="+localStorage);
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
            <Link onClick={this.logout} style={{float: 'right'}} href="#">logout</Link>
          </div></nav>
        <div className="container-fluid">
          <div className="row">    
           
            <div id="admin-main-control" className="col-md-10 p-x-3 p-y-1">
              <div style={{float: 'right', margin: '20px'}}>
                <div>
                  <form onSubmit={this.searchBy} className="form-inline my-2 my-lg-0">
                    <label htmlFor="inputState">Book</label>
                    <select  value={this.state.searchBy}
                     onChange={(event)=>{
                      this.setState({searchBy:event.target.value})
                  }}
                      style={{margin: '20px'}} id="inputState" className="form-control">
                      <option selected>Choose...</option>
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
                <i className="fa fa-dashboard" />
                <div>
                   
                    {/*Table */}
                    <br></br>
                <br></br>
                <button style={{margin:'30px'}}className="btn btn-primary" onClick={this.getAllBooks}>All-Books</button>
                <button className="btn btn-primary" >Borrowed Books</button>
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
      <th scope="col">Submit</th>
      
    </tr>
  </thead>
  <tbody>
  {
                     this.state.BookData.map((book)=>{
                       console.log("***********");
                       console.log(this.state.BookData);
                       console.log("***********");
                       console.log('length',this.state.BookData.length)
                       return (
                   <tr>
                       
                     <th scope="row">{book.bookid}</th>
                     <td>{book.bookname}</td>
                     <td>{book.author}</td>
                     <td>{book.categeory}</td>
                     <td>{book.language}</td>
                     <td><button onClick={this.requestBook.bind(this,book)} type="button" class="btn btn-success">Request For Book</button></td>
                     
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
