package com.example.magic_number_game.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GameSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int magicNumber;
    private boolean isActive;

    // Constructors
    public GameSession() {
    }

    public GameSession(int magicNumber, boolean isActive) {
        this.magicNumber = magicNumber;
        this.isActive = isActive;
    }

    //Getters and setters

    public Long getId() {
        return id;
    }
    public int getMagicNumber() {
        return magicNumber;
    }
    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
}
