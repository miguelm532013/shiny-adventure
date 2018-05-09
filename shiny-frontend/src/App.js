import React, { Component } from 'react';
import './App.css';
import Game from './Game.js';

class App extends Component {
  render() {
    return (
      <div className="App">
        <h1>Quote Detective</h1>
        <hr />
        <Game />
      </div>
    );
  }
}

export default App;
