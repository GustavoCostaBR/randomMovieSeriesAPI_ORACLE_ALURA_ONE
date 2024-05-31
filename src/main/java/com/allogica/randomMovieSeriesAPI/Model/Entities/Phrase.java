package com.allogica.randomMovieSeriesAPI.Model.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Phrase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phrase;

    public Long getId() {
        return id;
    }

    public String getPhrase() {
        return phrase;
    }

    public String getTitle() {
        return title;
    }

    public String getCharacter() {
        return character;
    }

    public String getPoster() {
        return poster;
    }

    private String title;

    private String character;

    private String poster;




}
