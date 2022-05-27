package com.example.demo.student;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
//@Data -> this can replace all the above, but the data then would be 'final', however the id cannot be final when loaded from a db
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
    

}
