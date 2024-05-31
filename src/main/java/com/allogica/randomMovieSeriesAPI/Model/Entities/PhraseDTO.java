package com.allogica.randomMovieSeriesAPI.Model.Entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PhraseDTO(@JsonProperty("titulo") String title,
                        @JsonProperty("frase") String phrase,
                        @JsonProperty("personagem") String character,
                        @JsonAlias("poster") String poster
                        ) {
}
