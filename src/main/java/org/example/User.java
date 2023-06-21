package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;
@Data
@Builder
@AllArgsConstructor
public class User {
    private String name;
    private Role Role;
    private String stack;


}
