import React, { Component } from 'react'

export default class Info extends Component {
    render() {
        return (
            <div>
                <form className="col-md-10 offset-1" style={{backgroundColor : 'rgb(236, 236, 114)'}}>
        <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Information</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">ID</label>
            <input type="text" className="form-control" placeholder="Please Enter ID" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Account Number</label>
            <input type="text" className="form-control" placeholder="Please EnterAccount Numberr " />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Name</label>
            <input type="text" className="form-control" placeholder="Please Enter Name" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Email Id</label>
            <input type="email" className="form-control" placeholder="Please Enter Email Id " />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Age</label><br />
            <input type="text" className="form-control" placeholder="Please Enter Age" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Designation</label>
            <input type="text" className="form-control" placeholder="Please EnterDesignation" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Gender</label><br />
            <select style={{width: '640.75px', height: '39.99px'}}>
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="Male">Male</option>
              <option value="Female">Female</option>
            </select>
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Date Of Birth</label>
            <input type="date" className="form-control" placeholder="dd-mm-yyyy" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Salary</label>
            <input type="text" className="form-control" placeholder="Please EnterDesignation" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Department ID</label>
            <input type="text" className="form-control" placeholder="Please Enter Department ID " />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Phone Number</label>
            <input type="text" className="form-control" placeholder="Please Enter Phone Number" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Manager ID</label>
            <input type="text" className="form-control" placeholder="Please Enter Manager ID " />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Date Of Joining</label>
            <input type="date" className="form-control" placeholder="dd-mm-yyyy" />
          </div>
          <div style={{textAlign: 'center', padding: '0px 102px 20px', margin: '30px'}} className="btn-group" role="group">  
            <button style={{width: '180px', height: '40px'}} type="reset" className="btn btn-outline-secondary">Reset</button>
            <button style={{width: '180px', height: '40px'}} type="submit" className=" btn btn-outline-primary">Submit</button>
          </div>
        </div>
      </form>
            </div>
        )
    }
}
