package com.coderscampus.todoapp.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
	
	private Integer idCounter = 0;
	private List<TodoItem> todoItems = new ArrayList<>();
	
	public List<TodoItem> fetchAllTodoItems() {
		if(todoItems.size() == 0) {
			TodoItem item1 = new TodoItem();
			item1.setId(idCounter++);
			item1.setIsDone(false);
			item1.setTask("Task #1");
			
			todoItems.add(item1);
		}
		return todoItems;
	}
	
}
