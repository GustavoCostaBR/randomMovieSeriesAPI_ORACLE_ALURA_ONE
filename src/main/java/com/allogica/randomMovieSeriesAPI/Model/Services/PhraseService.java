package com.allogica.randomMovieSeriesAPI.Model.Services;

import com.allogica.randomMovieSeriesAPI.Model.Entities.Phrase;
import com.allogica.randomMovieSeriesAPI.Model.Entities.PhraseDTO;
import com.allogica.randomMovieSeriesAPI.Model.Repositories.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PhraseService {

    @Autowired
    PhraseRepository phraseRepository;

    public PhraseDTO getRandomPhrase() {
        long count = phraseRepository.count();
        long id = (long) (Math.random() * count);
        Phrase phrase = phraseRepository.findById(id).orElse(null);
        if (phrase == null) {
            return null;
        }
        return new PhraseDTO(phrase.getPhrase(), phrase.getTitle(), phrase.getCharacter(), phrase.getPoster());
    }
}
