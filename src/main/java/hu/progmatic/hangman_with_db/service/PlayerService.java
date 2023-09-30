package hu.progmatic.hangman_with_db.service;

import hu.progmatic.hangman_with_db.model.Player;
import hu.progmatic.hangman_with_db.repo.PlayerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private PlayerRepo playerRepo;

    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public List<Player> getAllPlayer() {
        return playerRepo.findAll();
    }
}
