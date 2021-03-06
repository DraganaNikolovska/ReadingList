package com.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Dragana.Nikolovska on 11/1/2016.
 */
@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;


}
