package org.zerock.mallapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zerock.mallapi.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
  
}
