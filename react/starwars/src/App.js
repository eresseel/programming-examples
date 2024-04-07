import React, { Component } from 'react';
import ButtunList from './ButtonList';
import Character from './Character';

class App extends Component {
    state = {
        characters: [ {
            name: 'Darth Vader',
            image: 'https://www.kindpng.com/picc/m/29-295225_lego-star-wars-png-lego-darth-vader-figure.png',
            selected: false
        }, {
            name: 'Kylo Ren',
            image: 'https://www.pngitem.com/pimgs/m/93-931978_lego-star-wars-kylo-ren-star-war-lego.png',
            selected: false
        }, {
            name: 'Yoda',
            image: 'https://clipart.info/images/ccovers/1513358462Lego-Star-Wars-PNG.png',
            selected: false
        }, {
            name: 'Rey',
            image: 'https://psmedia.playstation.com/is/image/psmedia/lego-star-wars-tfa-two-column-01-ps4-eu-02feb16?$TwoColumn_Image$',
            selected: false
        }]
    }

    onClickHandler = (index) => _ =>{
        this.setState({
            characters: this.state.characters.map( (char, charIndex) =>
                ( (charIndex===index) ? ({...char, selected: true}) : ({...char, selected: false}) )
            )
        });
    }

    render () {
        return (
            <div>
                <ButtunList onClickFunc={this.onClickHandler} characters={this.state.characters} />
                <Character selectedChar={this.state.characters.find(char => char.selected)} />
            </div>
        )
    }
}

export default App;