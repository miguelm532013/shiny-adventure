import React, { Component } from 'react';

class Game extends Component {
    constructor(props) {
    super(props);
    this.state = {value: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({value: event.target.value});
  }

  handleSubmit(event) {
    alert('A name was submitted: ' + this.state.value);
    event.preventDefault();
  }
  render() {
    return (
        <div>
            <form onSubmit={this.handleSubmit}>
                <h2>[Quote Coming Here Soon!]</h2>
                <input type="radio" name="gender" value="male" checked />Roosevelt<br />
                <input type="radio" name="gender" value="female" />Gandhi<br />
                <input type="radio" name="gender" value="other" />Waluigi<br /><br />
                <input type="submit" value="Submit" />
            </form>
        </div>
    );
  }
}

export default Game;
