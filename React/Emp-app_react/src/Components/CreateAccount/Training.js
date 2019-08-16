import React, { Component } from 'react'

export default class Training extends Component {
    render() {
        return (
            <div>
                 <form className="col-md-6 offset-4" style={{backgroundColor : '#fff'}}>
        <h3 style={{textAlign: 'center', padding: '20px'}}>Training Details</h3>
        <hr />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Course ID</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Course ID" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Course Name</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Course Name" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Duration</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Course Duration" aria-label="Username" aria-describedby="addon-wrapping" />
        </div>
        <br />
        <div className="input-group flex-nowrap">
          <div className="input-group-prepend">
            <span className="input-group-text" id="addon-wrapping">Course Type</span>
          </div>
          <input type="text" className="form-control" placeholder="Enter Course Type" aria-label="Username" aria-describedby="addon-wrapping" />
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
