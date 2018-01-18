package io.ermdev.ermtv.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblboomark")
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
