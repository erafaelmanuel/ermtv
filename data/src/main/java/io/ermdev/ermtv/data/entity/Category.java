package io.ermdev.ermtv.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblcategory")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
