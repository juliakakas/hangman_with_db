package hu.progmatic.hangman_with_db.model;

import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long azonosító;
    private String name;
    private int score;

    public Player() {
    }

    public Player(Long azonosító, String name, int score) {
        this.azonosító = azonosító;
        this.name = name;
        this.score = score;
    }

    public Long getAzonosító() {
        return azonosító;
    }

    public void setAzonosító(Long azonosító) {
        this.azonosító = azonosító;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
