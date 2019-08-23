import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios';
export default class InsertBook extends Component {

    constructor(props) {
        super(props)
        this.state = {
            bookid: '',
            bookname: '',
            author: '',
            categeory: '',
            language: '',
            noofCopies: '',
            price: ''
        }

    }

    insertBook=(event)=> {
        event.preventDefault();
        let BookData = this.state;
        console.log("BookData", BookData);

        Axios.post('http://localhost:8080/InsertBook'
            ,BookData).then((response) => {
                console.log('response Object ', response)
                alert("Data is Saved");
                window.location.reload(); 
               

            }).catch((error) => {
                console.log('error', error)
                alert("Data is not Saved");
                window.location.reload(); 
                
            })  
    }

    Home=()=>{
        debugger;
        this.props.history.push('/homeLibrarian'); 
      }

      logout=()=>{
        this.props.history.push('/'); 
      }

       

    render() {
        return (
            <div>
                <nav id="nav" className="navbar navbar-inverse navbar navbar-dark bg-dark">
                    <div className="container-fluid">
                        <div className="navbar-header">
                            <a className="navbar-brand" href="#">Library Management System</a>
                        </div>
                        <Link onClick={this.logout} style={{ float: 'right', margin: '20px' }} href="#">logout</Link>
                        <Link onClick={this.Home} style={{ float: 'right', margin: '20px' }} href="#">Home</Link>

                    </div></nav>

                <form onSubmit={this.insertBook} className="col-md-10 offset-1" style={{ backgroundColor: '#bdcedf' }}>
                    <h3 style={{ textAlign: 'center', padding: '20px' }}>Insert Book</h3>
                    <hr />
                    <div className="form-row">
                        <div className="form-group col-md-6">
                            <label htmlFor="inputEmail4">BookID</label>
                            <input required type="text" onChange={(event) => {
                                this.setState({bookid:event.target.value })
                            }}
                                value={this.state.bookid} className="form-control" placeholder="Please Enter  BookID" />
                        </div>
                        <div className="form-group col-md-6">
                            <label htmlFor="inputPassword4">BookName</label>
                            <input required type="text" onChange={(event) => {
                                this.setState({bookname:event.target.value })
                            }}
                                value={this.state.bookname} className="form-control" placeholder="Please Enter Book Name " />
                        </div>
                    </div>
                    <div className="form-row">
                        <div className="form-group col-md-6">
                            <label htmlFor="inputPassword4">Author</label>
                            <input type="text" onChange={(event) => {
                                this.setState({author:event.target.value })
                            }}
                                className="form-control" value={this.state.author} placeholder="Enter Author" />
                        </div>
                        <div className="form-group col-md-6">
                            <label htmlFor="inputPassword4">Category</label>
                            <input type="text" onChange={(event) => {
                                this.setState({categeory:event.target.value })
                            }}
                                value={this.state.categeory} className="form-control" placeholder=" Enter Category " />
                        </div>
                    </div>
                    <div className="form-row">
                        <div className="form-group col-md-6">
                            <label htmlFor="inputEmail4">Language</label><br />
                            <input type="text" onChange={(event) => {
                                this.setState({language:event.target.value })
                            }}
                                value={this.state.language} className="form-control" placeholder=" Enter Language" />
                        </div>
                        <div className="form-group col-md-6">
                            <label htmlFor="inputPassword4">NumberOfCopies</label>
                            <input type="text"
                                onChange={(event) => {
                                    this.setState({noofCopies:event.target.value })
                                }}
                                value={this.state.noofCopies}
                                className="form-control" placeholder="Enter NumberOfCopies" />
                        </div>
                    </div>
                    <div className="form-row">
                        <div className="form-group col-md-6">
                            <label htmlFor="inputEmail4">Price</label><br />
                            <input type="text" onChange={(event) => {
                                this.setState({price:event.target.value })
                            }}
                                value={this.state.price} className="form-control" placeholder="Enter Price" />
                        </div>
                    </div>
                    <div>
                        <button style={{ margin: '20px', float: 'right' }} className="btn btn-primary">Submit</button>
                        <button style={{ margin: '20px', float: 'right' }} className="btn btn-primary" >Reset</button>

                    </div>

                </form>
            </div>
        )
    }
}
