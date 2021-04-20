import logo from './logo.svg';
import './App.css';
import { useEffect, useState, Fragment } from 'react';
import {TodoItem} from './components/todoItem.jsx'

function App() {

  const [todoItems, setTodoItems] = useState(null);
  
  useEffect(() => {

    console.log("Hey! I have loaded up!!");

    if (!todoItems) {
      fetch('http://localhost:8080/api/todoItems')
        .then((response) => response.json())
        .then((data) => {
          console.log(data);
          setTodoItems(data);
        });
    }
  }, [todoItems]);

  return (
    <div>
      {
        todoItems
        ?
        todoItems.map((todoItem) => {
          return (
            <>
              <TodoItem/>
            </>
          );
        })
        : "Loading Data..."
    }
    </div >
  );
}

export default App;
