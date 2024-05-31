package com.allogica.randomMovieSeriesAPI.Controller;

import com.allogica.randomMovieSeriesAPI.Model.Entities.Phrase;
import com.allogica.randomMovieSeriesAPI.Model.Entities.PhraseDTO;
import com.allogica.randomMovieSeriesAPI.Model.Services.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class PhraseController {

    @Autowired
    PhraseService phraseService;

    @GetMapping("/frases")
    public PhraseDTO getPhrase() {
        return phraseService.getRandomPhrase();
    }

}
