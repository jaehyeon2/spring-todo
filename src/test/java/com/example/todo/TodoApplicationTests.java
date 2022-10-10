package com.example.todo;

import com.example.todo.entity.TodoEntity;
import com.example.todo.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodoApplicationTests {

	@Autowired
	private TodoRepository todoRepository;

	@Test
	void testJpa(){
		TodoEntity todo1 = new TodoEntity();
		todo1.setContent("eat lunch");
		todo1.setCompleted(Boolean.TRUE);
		this.todoRepository.save(todo1);

		TodoEntity todo2 = new TodoEntity();
		todo2.setContent("study spring");
		todo2.setCompleted(Boolean.TRUE);
		this.todoRepository.save(todo2);


	}

}
