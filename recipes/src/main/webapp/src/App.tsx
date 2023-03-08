import React from 'react';
import './App.css';
import Header from './Header';

function App() {
  return (
    <div className="App container-fluid">
      <div className="container-fluid p-3 bg-dark text-light bg-gradient">
        <h4>An online cookbook to help you keep track of recipes and ingredients in your pantry, making cooking a breeze.</h4>
      </div>
      <Header/>
    </div>
  );
}

export default App;