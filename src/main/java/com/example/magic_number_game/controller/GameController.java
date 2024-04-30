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

    @GetMapping("/")
    public String startGame (Model model) {
        GameSession gameSession = gameService.startNewGame(); // This line invokes the startNewGame method of the gameService instance to start a new game. It assigns the returned GameSession object to the gameSession variable.
        model.addAttribute("gameSession", gameSession.getId());// This line adds an attribute named "gameSession" to the model. The "gameSession" attribute holds the GameSession object created in the previous step. This allows the view to access and display information about the game session.
        System.out.println(gameSession.getMagicNumber());
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
      /*  if (result.equals("Game session not found or not active.")) {
            // Handle the error condition
            // For example, redirect to the start page
            return "redirect:/";
        }*/

        model.addAttribute("result", result);
        return "guess";
    }


}



/*
* startGame(): This method handles GET requests to the "/" endpoint. It starts a new game session using the GameService, adds the game session to the model, and returns the name of the view to render. It appears that you're returning "start" as the view name, so Spring will render the "start" view in response to requests to the "/" endpoint.
makeGuess(): This method handles GET requests to the "/guess" endpoint. It takes two request parameters, sessionId and guess, and passes them to the GameService to make a guess. The result of the guess is added to the model with the key "result", and the method returns "guess" as the view name. Presumably, there should be a "guess" view that displays the result of the guess to the user.*/
