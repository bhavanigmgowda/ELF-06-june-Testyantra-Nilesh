import React, { Component } from 'react'
import './Address.css'
export default class Address extends Component {
    render() {
        return (
                <div id="main">
                 <form className="col-md-10 offset-1" style={{backgroundColor : 'rgb(236, 236, 114)'}}>
        <h3 style={{textAlign: 'center', padding: '20px'}}>Employee OtherInfo</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">ID</label>
            <input type="text" className="form-control" placeholder="Please Enter ID" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">City</label>
            <input type="text" className="form-control" placeholder="Please Enter City " />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Address type</label>
            <select style={{width: '640.75px', height: '39.99px'}}>
              <option value disabled="disabled" selected="selected">Select-one</option>
              <option value="Permanent">Permanent</option>
              <option value="Female">Tempory</option>
            </select>
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">State</label>
            <input type="email" className="form-control" placeholder=" Enter State " />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Address1</label><br />
            <input type="text" className="form-control" placeholder=" Enter Address1" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Country</label>
            <input type="text" className="form-control" placeholder="Enter Country" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Address2</label><br />
            <input type="text" className="form-control" placeholder=" Enter Address2" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="Pincode">Pincode</label>
            <input type="date" className="form-control" placeholder="enter  Pincode" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Landmark</label>
            <input type="text" className="form-control" placeholder="Please Enter Landmark" />
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
