import React, { Component } from 'react';
import Book from './Book';

class BookList extends Component {
    state = {
        books: [
            {
                title: 'Avatar',
                isbn:  'abc123'
            }, {
                title: 'Star Wars',
                isbn:  'abc345'
            }, {
                title: 'Bekes harcos utja',
                isbn:  'abc789'
            },
        ]
    }
    constructor() {
        super();
        console.log(1);
    }

    UNSAFE_componentWillMount() {
        console.log(2);
    }

    componentDidMount() {
        console.log(4);

        setTimeout(() => {
            this.setState({
                books: [...this.state.books, {title: 'Egri csillagok', isbn: 'ert987'}]
            });
        }, 2000);

        setTimeout(() => {
            this.setState({
                books: this.state.books.map(books => ( (books.title==='Avatar') ? ({...books, title: 'A lany het nevvel'}) : ({...books}) ))
            });
        }, 4000);
    }

    render () {
        console.log(3);
        return (
        <div>
            {this.state.books.map( (books, index) => (<Book books={books} key={index}/>) )}
        </div>
        )
    }

}

export default BookList