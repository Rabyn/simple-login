package com.cubic.todo.service;

import java.util.Date;
import java.util.List;

import com.cubic.todo.model.Todo;

public interface TodoService {

	List<Todo> retrieveTodos(final String user);
	
	void addTodo(final String name, final String desc, final Date targetDate, final boolean isDone);
	
	void deleteTodo(final int id);
	
	Todo retrieveTodo(final int id);
	
	void updateTodo(final Todo todo);
}
