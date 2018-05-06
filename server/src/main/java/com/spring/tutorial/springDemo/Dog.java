package com.spring.tutorial.springDemo;



import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Dog {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
}
