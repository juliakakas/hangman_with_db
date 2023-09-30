package hu.progmatic.hangman_with_db.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
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

}
