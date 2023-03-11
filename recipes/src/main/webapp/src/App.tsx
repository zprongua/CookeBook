import React from 'react';
import './App.css';
import Header from './Header';

function App() {
  return (
    <div className="App container-fluid">
      <Header/>
      <div className="row">
        <div className="col-3"></div>
        <div className="col-5 text-start">
          Features:
          <ul>
            <li>Store your recipes online for quick access wherever you are.</li>
            <li>Keep track of ingredients in your pantry.</li>
            <li>Create shopping lists based on your recipes.</li>
            <li>Sugest recipes based on ingredients you already have.</li>
          </ul>
        </div>
        <div className="col-3"></div>
      </div>
      <div className="row">
        <div className="col-3"></div>
          <div className="col-5 text-center">
            <button type="button" className="btn btn-secondary">Get Started</button>
            <button type="button" className="btn btn-secondary">Login</button>
          </div>
        <div className="col-3"></div>
      </div>
    </div>
  );
}

export default App;