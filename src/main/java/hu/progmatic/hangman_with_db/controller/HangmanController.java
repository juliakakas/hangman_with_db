package hu.progmatic.hangman_with_db.controller;

import hu.progmatic.hangman_with_db.model.Word;
import hu.progmatic.hangman_with_db.service.GameService;
import hu.progmatic.hangman_with_db.service.WordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HangmanController {
    private GameService gameService;

    public HangmanController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("game", gameService.getGame());
        return "game";
    }

    @PostMapping("/play")
    public String getInput(@RequestParam("input") String input){
        gameService.useInput(input.charAt(0));
        if(gameService.isEnd()){
            return "redirect:/game_end";
        }
        return "redirect:/home";
    }

    @GetMapping("/game_end")
    public String gameEnd(Model model){
        model.addAttribute("message", gameService.getGame().getLife() == 0 ?
                "noob" : "gg");
        gameService.newGame();
        return "game_end";
    }
}
