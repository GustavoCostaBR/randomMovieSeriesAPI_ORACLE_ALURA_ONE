package com.allogica.randomMovieSeriesAPI.Model.Repositories;

import com.allogica.randomMovieSeriesAPI.Model.Entities.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {

    long count();
}
