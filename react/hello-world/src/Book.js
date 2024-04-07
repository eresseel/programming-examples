// class componens
import React, {Component} from 'react';
import BookTitle from './BookTitle';

class Book extends Component {

    state = {
        a1: true,
        a2: [],
        selected: null,
        title: this.props.books.title
    }

    constructor (props) {
        super(props);
        console.log(this.props.books);
    }

    onClickHandler = (title) => (event) => {
        console.log(event)
        this.setState({
            selected: title
        }, () => {
            console.log(this.state.selected)
        });
    }

    UNSAFE_componentWillReceiveProps(nextProps) {
        this.setState({
            title: nextProps.books.title
        });
    }

    render() {
        const {isbn} = this.props.books;
        return (
            <div>
                <BookTitle title={this.state.title} onClickFunc={this.onClickHandler} />
                <p>{isbn}</p>
            </div>
        );
    }
}

export default Book;