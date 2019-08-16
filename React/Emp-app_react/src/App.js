import React from 'react';
import Login from './Components/login/Login';
import HomePage from './Components/Home/HomePage';
import {BrowserRouter as Router, Route, Link } from 'react-router-dom'
import AllForms from './Components/CreateAccount/AllForms'


function App() {
  return (
    <div className="App">
      
     <Router>
     <Route exact path='/'component={Login} ></Route>
     <Route path='/home'component={HomePage} ></Route>
     <Route path='/createAccount' component={AllForms}></Route>
     </Router>
    </div>
  );
}

export default App;
