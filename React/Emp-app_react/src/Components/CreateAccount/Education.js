import React, { Component } from 'react'

export default class Education extends Component {
    render() {
        return (
            <div>
        <form className="col-md-6 offset-4" style={{backgroundColor :'#fff'}}>
        <h3 style={{textAlign: 'center', padding: '20px'}}>Educational Details</h3>
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
            <span className="input-group-text" id="addon-wrapping">Education Type</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Education Type" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Degree Type</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Degree Type" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Branch</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Branch" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Collage Name</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Collage Name" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">University</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter University" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Year Of Passing</span>
          </div>
          <input type="text" className="form-control" placeholder="dd-mm-yyyy " aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Percentage</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Percentage" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Location</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Location" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
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
