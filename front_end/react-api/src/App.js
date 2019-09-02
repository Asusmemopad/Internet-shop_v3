import React, { Component } from 'react';
import Goods from './components/Goods';

 class App extends Component {

  render() {
    return (
        <Goods goods ={this.state.goods} />
    )
}

state = {
    goods: []
};

componentDidMount() {
    fetch('http://localhost:9000/goods')
        .then(res => res.json())
        .then((data) => {
            this.setState({ goods: data })
        })
        .catch(console.log)
}
}

export default App;