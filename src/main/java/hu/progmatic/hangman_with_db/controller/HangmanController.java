package hu.progmatic.hangman_with_db.controller;

import hu.progmatic.hangman_with_db.model.Word;
import hu.progmatic.hangman_with_db.service.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HangmanController {
    private WordService wordService;

    public HangmanController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping
    public List<Word> getAllWord(){
        return wordService.getAllWord();
    }
}
