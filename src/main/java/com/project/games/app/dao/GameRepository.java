package com.project.games.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.games.app.entity.Game;

public interface GameRepository extends JpaRepository<Game, Integer> {

	List<Game> findByTitle(String title);
}
