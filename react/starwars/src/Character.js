import React, { Component } from 'react';

class Caracter extends Component {

    state = {
       name: null,
       image: null 
    }

    UNSAFE_componentWillReceiveProps(nextProps) {
        this.setState({
            name: nextProps.selectedChar.name,
            image: nextProps.selectedChar.image
        });
    }

    render () {
        return (
            <div>
                {this.state.name && <div>
                <h2>{this.state.name}</h2>
                <img src={this.state.image} alt="Char" />
                </div>}
            </div>
        )
    }
}

export default Caracter;