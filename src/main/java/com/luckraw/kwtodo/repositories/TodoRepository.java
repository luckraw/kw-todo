package com.luckraw.kwtodo.repositories;

import com.luckraw.kwtodo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
