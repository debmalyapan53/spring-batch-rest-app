package com.project.games.app.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.games.app.entity.Game;
import com.project.games.app.service.GameService;

@Component
public class DBWriter implements ItemWriter<Game> {

	@Autowired
	private GameService gameService;

	@Override
	public void write(List<? extends Game> items) throws Exception {
		
		System.out.println("Data saved "+items);
		items.forEach(g->gameService.saveGame(g));
		
		
	}
	
}
