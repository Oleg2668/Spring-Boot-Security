package com.example.Spring_Boot_Security.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable {


    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String phone;

    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

    @JoinTable(
            // Найменування таблиці об’єднання (Join table).
            name = "user_roles",

            joinColumns = {
                    @JoinColumn(
                            // Стовпчик таблиці user_roles
                            name = "user_id",
                            // Стовпчик таблиці users
                            referencedColumnName = "id"
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            // Стовпчик таблиці user_roles
                            name = "role_id",
                            // Стовпчик таблиці roles
                            referencedColumnName = "id"
                    )
            }
    )
    private List<Role> roles = new ArrayList<>();

}

