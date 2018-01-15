package io.ermdev.ermtv.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbluser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
}
