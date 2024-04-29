package com.example.magic_number_game.repository;

import com.example.magic_number_game.model.GameSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameSessionRepository extends JpaRepository <GameSession, Long> {

}
