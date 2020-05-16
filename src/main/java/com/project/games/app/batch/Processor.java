package com.project.games.app.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.project.games.app.entity.Game;

@Component
public class Processor implements ItemProcessor<Game, Game> {

	@Override
	public Game process(Game item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
