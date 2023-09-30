package hu.progmatic.hangman_with_db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Word {
    @Id
    private String word;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

}
