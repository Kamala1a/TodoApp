import React from 'react';

const TodoItem = () => {
    return (
        <Fragment key = {todoItem.id}>
            <input type="checkbox" checked={todoItem.isDone} />
            <span>{todoItem.task}</span>
        </Fragment>
    );
};

export default TodoItem;