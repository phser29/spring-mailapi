package org.zerock.mallapi.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_tobo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long tno;

  private String title;

  private String writer;

  private boolean complete;

  private LocalDate dueDate;

  public void changeTitle(String title) {
    this.title = title;
  }
  public void changeComplete(boolean complete) {
    this.complete = complete;
  }
  public  void changeDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

}
