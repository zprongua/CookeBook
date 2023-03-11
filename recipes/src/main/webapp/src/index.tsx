import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Pantry from './Pantry';
import Cookbook from './Cookbook';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes> 
        <Route path="/" element={<App />} />
        <Route path="/cookbook" element={<Cookbook />} />
        <Route path="/pantry" element={<Pantry />} />
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);