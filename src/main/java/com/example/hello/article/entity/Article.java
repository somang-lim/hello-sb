package com.example.hello.article.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class Article {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String subject;

}
