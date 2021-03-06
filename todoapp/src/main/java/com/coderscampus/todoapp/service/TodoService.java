package com.coderscampus.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.todoapp.model.TodoItem;
import com.coderscampus.todoapp.model.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	public List<TodoItem> fetchAllTodoItems() {
		return todoRepository.fetchAllTodoItems();
	}
	
}
