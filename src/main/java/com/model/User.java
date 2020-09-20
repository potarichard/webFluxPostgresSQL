package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("users")
public class User {

	// TODO: refactor this to UUID
    @Id
    private Integer id;
    private String name;
    private int age;
    private double salary;
}
