package com.project.games.app.service;

import java.util.List;

import com.project.games.app.entity.Game;

public interface GameService {

	public List<Game> getGames();

	public void saveGame(Game theGame);

	public List<Game> getGame(String title);

	public Game deleteGame(int id);

}
