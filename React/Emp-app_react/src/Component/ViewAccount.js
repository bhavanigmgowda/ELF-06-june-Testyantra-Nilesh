import React, { Component } from 'react'
import Axios from 'axios';
import {Modal,Button} from 'react-bootstrap'
export class ViewAccount extends Component {

  constructor(props) {
    super(props);
    this.state = {
      accounts: [],
      show: false,
      name:'',
      email:'',
      phone:'',
      id:''
    }
  }

  componentDidMount() {
    this.getAccount();
  }

    //fetch the data from db
  getAccount() {
    Axios.get('https://emp-app1-965fc.firebaseio.com/accounts.json')
      .then((response) => {
        console.log('response', response.data);

        let fetchedAccount = []; //array 
        // forin give index 
        for (let key in response.data) {

          //console.log(response.data[key])

          fetchedAccount.push({
            ...response.data[key],
            id: key
          })
          //concate two Object using 

        }
        this.setState({
          accounts: fetchedAccount

        })

        console.log("Array", fetchedAccount)
      }
      ).catch((error) => {
        console.log('error', error)
      }
      )
  }

  // delete the account
  deleteAccount(account) {
    console.log('account id',account.id);
    Axios.delete('https://emp-app1-965fc.firebaseio.com/accounts/' + account.id + '/.json').
      then((response) => {

        alert("Delete Successfully");
        debugger;
        let allAccount = this.state.accounts;
        let index = allAccount.indexOf(account);
        let newAccounts = allAccount.splice(index, 1); // splice method effect orignial array

        console.log('new Account', newAccounts);
        this.setState({
          accounts: allAccount

          // or we call api to hit datebase
          // this.getAccount();   

        })
      }).catch((error) => {

        alert('deletion failed')
      });



  }

    // edit Account 
      
     editAccount(account){
           this.setState({
             name:account.name,
             email:account.email,
             phone:account.phone,
             password:account.password,
             id:account.id,
             show :!this.state.show
           })
     }

      //handle close
       handleClose(){
         this.setState({
          show :!this.state.show
         })
           
       }

      // updateAccountDate
       
      updateAccountDate(){
           // object destructure -es6
          const{id,name,email,phone,password} =this.state;
          // call api for update to firebase database
           const account={name,email,phone,password};
           console.log('update the date',account)

          Axios.put('https://emp-app1-965fc.firebaseio.com/accounts/'+id+'/.json',account).
          then((response)=>{
             console.log("update Succesfully");
             this.handleClose();  // close the model
             this.getAccounts(); // update the view 
          }).catch((error)=>{
              console.log("Error",error);
             
          })
      }

  render() {
    return (
      <div>
        <table className="table table-striped">
          <thead>
            <tr>
              <th scope="col">Name</th>
              <th scope="col">Email</th>
              <th scope="col">PhoneNumber</th>
              <th scope="col">Password</th>
            </tr>
          </thead>
          <tbody>
            {

              this.state.accounts.map((account) => {
                console.log('key',account.key);
                return (
                  <tr key={account.key}>
                   
                    <td>{account.name}</td>
                    <td>{account.email}</td>
                    <td>{account.phone}</td>
                    <td>{account.password}</td>
                    <td>

                      <button onClick={this.deleteAccount.bind(this,account)}
                        className='btn btn-Danger' >DELETE </button>


                    </td>
                    <td>

                      <button onClick={this.editAccount.bind(this, account)}
                        className='btn btn-success' >Edit </button>


                    </td>

                  </tr>)

              })

            }
          </tbody>
        </table>
        <div>
          <Modal show={this.state.show} onHide={this.handleClose.bind(this)}>
            <Modal.Header closeButton>
              <Modal.Title>Modal heading</Modal.Title>
            </Modal.Header>
            <Modal.Body>
              
              <div className="row">
                <div class="col">
                  <input
                    onChange={(event) => {
                      this.setState({ name: event.target.value })
                    }}
                    value={this.state.name} type="text" className="form-control" placeholder="name" />
                </div>
                <div className="col">
                  <input
                    onChange={(event) => {
                      this.setState({ email: event.target.value })
                    }}
                    value={this.state.email} type="text" className="form-control" placeholder="Email" />
                </div>
              </div>
              <div className="row">
                <div class="col">
                  <input
                    onChange={(event) => {
                      this.setState({ phone: event.target.value })
                    }}
                    value={this.state.phone} type="number" className="form-control" placeholder="Phone" />
                </div>
                <div className="col">
                  <input
                    onChange={(event) => {
                      this.setState({ password: event.target.value })
                    }}
                    value={this.state.password} type="password" className="form-control" placeholder="Passsword" />
                </div>
              </div>



            </Modal.Body>
            <Modal.Footer>
              <Button variant="secondary" onClick={this.handleClose.bind(this)}>
                Close
          </Button>
              <Button variant="primary" onClick={this.updateAccountDate.bind(this)}>
                Save Changes
          </Button>
            </Modal.Footer>
          </Modal>
        </div>

      </div>
    )
  }
}

export default ViewAccount
