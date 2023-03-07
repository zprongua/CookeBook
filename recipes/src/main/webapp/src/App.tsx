import React from 'react';
import './App.css';
import Header from './Header';

function App() {
  return (
    <div className="App p-3">
      <Header/>
      <div className="container-fluid rounded p-3 bg-dark text-light">
        <h4>An online cookbook to help you keep track of recipes and ingredients in your pantry, making cooking a breeze.</h4>
      </div>
    </div>
  );
}

export default App;