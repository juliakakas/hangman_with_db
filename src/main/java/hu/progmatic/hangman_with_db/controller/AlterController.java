package hu.progmatic.hangman_with_db.controller;

import hu.progmatic.hangman_with_db.model.Player;
import hu.progmatic.hangman_with_db.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class AlterController {
    private PlayerService playerService;

    public AlterController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getAll(){
        return playerService.getAllPlayer();
    }
}
