package io.ermdev.ermtv.data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblitem")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Date dateAdded;
}
