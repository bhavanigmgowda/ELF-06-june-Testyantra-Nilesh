import React, { Component } from 'react'

export default class OtherInfo extends Component {
    render() {
        return (
            <div>
                 <form className="col-md-10 offset-1" style={{backgroundColor : 'rgb(236, 236, 114)'}}>
        <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Other Information</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">ID</label>
            <input type="text" className="form-control" placeholder="Please Enter ID" />
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Emergency Contact Name</label>
            <input type="text" className="form-control" placeholder="Please Enter Emergency Contact Number " />
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputAddress">Mother Name</label>
            <input type="text" className="form-control" id="inputAddress" placeholder="Please Enter Mother Name" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">Pan Number</label>
            <input type="text" className="form-control" placeholder="Please Enter Pan Number" />
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Emergency Contact Number</label>
            <input type="text" className="form-control" placeholder="Please Enter Emergency Contact Number " />
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputAddress">Spouse Name</label>
            <input type="text" className="form-control" id="inputAddress" placeholder="Please Enter Spouse Name" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">Married Status</label><br />
            <select style={{width: '408.75px', height: '37.99px'}}>
              <option value="Married">Married</option>
              <option value="Single">Single</option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Nationality</label>
            <select style={{width: '408.75px', height: '37.99px'}}>
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="Indian">Indian</option>
              <option value="Other">Other</option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputAddress">Passport Number</label>
            <input type="text" className="form-control" id="inputAddress" placeholder="please enter Passport Number" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">Blood Group</label>
            <select style={{width: '408.75px', height: '37.99px'}}>
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="A+">A+</option>
              <option value="B+">B+</option>
              <option value="O+">O+</option>
              <option value="AB+">AB+</option>
              <option value="A-">A-</option>
              <option value="B-">B-</option>
              <option value="O-">O-</option>
              <option value="AB-">AB-</option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Religion</label>
            <select style={{width: '408.75px', height: '37.99px'}}>
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="Hinduism">Hinduism</option>
              <option value="Islam">Islam</option>
              <option value="Sikhism">Sikhism </option>
              <option value="Buddhism">Buddhism</option>
              <option value="Jainism">Jainism</option>
              <option value="Other religions ">Other religions </option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputAddress">Aadhar Number</label>
            <input type="text" className="form-control" id="inputAddress" placeholder="Please Enter  Aadhar Number" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">Physically Challenged?</label>
            <select style={{width: '408.75px', height: '37.99px'}}>
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="YES">YES</option>
              <option value="NO">NO</option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Father Name</label>
            <input type="text" className="form-control" placeholder="Please Enter Father Name " />
          </div>
          <div style={{textAlign: 'center', padding: '27px 42px 20px'}} className="btn-group" role="group">  
            <button style={{width: '130px', height: 'fit-content'}} type="reset" className="btn btn-outline-secondary">Reset</button>
            <button style={{width: '130px', height: 'fit-content'}} type="submit" className=" btn btn-outline-primary">Submit</button>
          </div>
        </div>
      </form>
            </div>
        )
    }
}
