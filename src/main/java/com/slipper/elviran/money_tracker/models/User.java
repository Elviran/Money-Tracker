package com.slipper.elviran.money_tracker.models;


import com.slipper.elviran.money_tracker.enums.Provider;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;


@Entity
@Getter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    @SequenceGenerator(name="user_gen", sequenceName="user_seq")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "provider")
    @Enumerated(EnumType.STRING)
    private Provider provider;

}
