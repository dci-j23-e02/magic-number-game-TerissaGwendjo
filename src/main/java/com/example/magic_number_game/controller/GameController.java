package com.example.magic_number_game.controller;

import com.example.magic_number_game.model.GameSession;
import com.example.magic_number_game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/start")
    public String startGame (Model model) {
        GameSession gameSession = gameService.startNewGame(); // This line invokes the startNewGame method of the gameService instance to start a new game. It assigns the returned GameSession object to the gameSession variable.
        model.addAttribute("gameSession", gameSession); // This line adds an attribute named "gameSession" to the model. The "gameSession" attribute holds the GameSession object created in the previous step. This allows the view to access and display information about the game session.
        return "start"; // This line returns the name of the view that should be rendered in response to the request. In this case, it returns "start", indicating that Spring should render the "start" view.

        /*
        * So, when a GET request is made to the "/start" endpoint, the startGame method is called.
        * It starts a new game session using the GameService, adds the game session to the model, and returns the
        * name of the view to render. The actual rendering of the view is handled by Spring's view resolver based on the returned view name.*/

        /*
        * The "start" view refers to a thymeleaf template or page that is responsible for displaying the initial state of the
        * game when a user accesses the "/start" URL in the application*/

    }

    @GetMapping("/guess")
    public String makeGuess (@RequestParam Long sessionId, @RequestParam int guess, Model model) {
        String result = gameService.makeGuess(sessionId, guess);
        model.addAttribute("result", result);
        return "guess";
    }


}
