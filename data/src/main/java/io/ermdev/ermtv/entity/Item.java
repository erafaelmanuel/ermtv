package io.ermdev.ermtv.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblitem")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
}
