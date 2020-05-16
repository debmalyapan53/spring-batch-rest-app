package com.project.games.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.games.app.entity.Game;
import com.project.games.app.pojo.ApiResponse;
import com.project.games.app.service.GameService;

@RestController
@RequestMapping("/api")
class GamesRestController {

	@Autowired
	private GameService gameService;
			
	@PostMapping("/games")
	public ApiResponse addGame(@RequestBody Game game){
		gameService.saveGame(game);
		return new ApiResponse(HttpStatus.OK.value(),"SUCCESS",game);
	}

	@PutMapping("/games")
	public ApiResponse updateGame(@RequestBody Game game) {
		gameService.saveGame(game);
		return new ApiResponse(HttpStatus.OK.value(),"SUCCESS",game);
	}
	
	@DeleteMapping("/games/{id}")
	public ApiResponse deleteCustomer(@PathVariable int id) {		
		return new ApiResponse(HttpStatus.OK.value(),"SUCCESS",gameService.deleteGame(id));
	}
	
	@GetMapping("/games")
	public ApiResponse getGames(){
		return new ApiResponse(HttpStatus.OK.value(),"SUCCESS",gameService.getGames());
	}
	
	@GetMapping("/games/{title}")
	public ApiResponse getGames(@PathVariable String title){
		return new ApiResponse(HttpStatus.OK.value(),"SUCCESS",gameService.getGame(title));
	}

	
}
