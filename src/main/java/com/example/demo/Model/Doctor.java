package com.example.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Doctor {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String password;
}
