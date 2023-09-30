package hu.progmatic.hangman_with_db.model;

import lombok.Data;

import java.util.Set;

@Data
public class Game {
    private String word;
    private String wordAtLine;
    private Set<Character> inputs;
    private int life;
    private boolean isEnd;

    public boolean addInput(char input) {
        return inputs.add(input);
    }
}
