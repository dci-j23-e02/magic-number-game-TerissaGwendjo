package com.example.magic_number_game.service;

import com.example.magic_number_game.model.GameSession;
import com.example.magic_number_game.repository.GameSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameSessionRepository gameSessionRepository;

    public GameSession startNewGame() {
        GameSession gameSession = new GameSession();
        gameSession.setMagicNumber(generateMagicNumber());
        System.out.println("New Game");
        return gameSessionRepository.save(gameSession);
    }

    private int generateMagicNumber() {
        //Generate a random magic number (for example)
        //Its purpose is to generate a random integer between 1 and 100, inclusive, and return it
        return (int) (Math.random() * 100) +1;
    }

    public String makeGuess(Long sessionId, int guess) {
        //this line retrieves a GameSession entity from the database based on the provided sessionId, or it returns null if no entity is found with that sessionId.
        GameSession gameSession = gameSessionRepository.findById(sessionId).orElse(null);
        if (gameSession == null || !gameSession.isActive()) {
            return "Game session not found or not active.";
        }

        int magicNumber = gameSession.getMagicNumber();
        if (guess == magicNumber) {
            gameSession.setActive(false);
            gameSessionRepository.save(gameSession);
            return "Congratulations! You guessed the magic number.";
        } else if (guess < magicNumber) {
            return "Try a higher number.";
        } else {
            return "Try a lower number.";
        }
    }


}
