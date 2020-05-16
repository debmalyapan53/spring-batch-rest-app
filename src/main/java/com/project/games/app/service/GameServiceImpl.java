package com.project.games.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.games.app.dao.*;
import com.project.games.app.entity.*;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Override
	@Transactional
	public void saveGame(Game theGame) {
		gameRepository.save(theGame);
	}

	@Override
	@Transactional
	public Game deleteGame(int id) {
		Game g = gameRepository.findById(id).orElse(null);
		gameRepository.deleteById(id);
		return g;
	}

	@Override
	public List<Game> getGames() {
		return gameRepository.findAll();
	}

	@Override
	public List<Game> getGame(String title) {
		return gameRepository.findByTitle(title);
	}
}





