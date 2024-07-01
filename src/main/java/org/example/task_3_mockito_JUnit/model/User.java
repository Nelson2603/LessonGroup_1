package org.example.task_3_mockito_JUnit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
   private int id;
   private String name;
   private double salary;
   private String department;

}
