import React from 'react';
import Login from './Component/Login/login';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Home from './Component/Login/Home';
import BorrowTable from './Component/Login/BorrowTable';
import SearchUser from './Component/User/SearchUser';
import Homead from './Component/Admin/Homead';
import Homelab from './Component/Librarian/Homelab';
import SearchAdmin from './Component/Admin/SearchAdmin';
import CreateUser from './Component/CreateUser';
import InsertBook from './Component/InsertBook';
function App() {
  return (
    <div className="App">
     
        <Router>
       
     <Route exact path='/'component={Login} ></Route>
     <Route path='/homeLibrarian'component={Homelab} ></Route>
     <Route path='/home'component={Home} ></Route>
     <Route path='/homeAdmin'component={Homead} ></Route>
      <Route path='/searchAdmin'component={SearchAdmin} ></Route>
     <Route path='/searchUser'component={SearchUser} ></Route>
     <Route path='/createUser'component={CreateUser} ></Route>
     <Route path='/insertBook'component={InsertBook} ></Route>
     
     </Router>
    </div>
  );
}

export default App;
   

