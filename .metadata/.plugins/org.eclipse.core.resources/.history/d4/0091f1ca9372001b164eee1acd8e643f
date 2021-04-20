package com.coderscampus.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.todoapp.model.TodoItem;
import com.coderscampus.todoapp.service.TodoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping("/api/todoItems")
	public ResponseEntity<?> fetchAllTodoItems() {
		List<TodoItem> todoItems = todoService.fetchAllTodoItems();
		//return ResponseEntity.status(HttpStatus.OK).body(todoItems);
		return ResponseEntity.ok(todoItems);
	}
	
}
