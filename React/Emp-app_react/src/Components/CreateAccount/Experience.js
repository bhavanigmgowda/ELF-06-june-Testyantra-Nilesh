import React, { Component } from 'react'

export default class Experience extends Component {
    render() {
        return (
            <div>
                 <form className="col-md-6 offset-4" style={{backgroundColor : 'rgb(236, 236, 114)'}}>
        <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Experience Details</h3>
        <hr />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">ID</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Employee ID" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Company Name</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Company Name" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Designation</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Designation" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Joining Date</span>
          </div>
          <input type="text" className="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">leaving Date</span>
          </div>
          <input type="text" className="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <br />
        <div style={{textAlign: 'center', padding: '0px 102px 20px'}} className="btn-group" role="group">  
          <button style={{width: '150px'}} type="reset" className="btn btn-outline-secondary">Reset</button>
          <button style={{width: '150px'}} type="submit" className=" btn btn-outline-primary">Submit</button>
          <br />
          <br />
        </div>
      </form>
            </div>
        )
    }
}
