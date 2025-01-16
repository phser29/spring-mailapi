package org.zerock.mallapi.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.mallapi.domain.TodoDTO;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@RequiredArgsConstructor
@Log4j2
public class TodoServiceImpl implements TodoService {

  private final ModelMapper modelMapper;
  private final 

  @Override
  public Long register(TodoDTO todoDTO) {
    
    log.info(todoDTO);

    return null;
  }
  

}
