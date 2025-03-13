package com.dev.gamelist.dto;

import com.dev.gamelist.entities.GameList;

import io.swagger.v3.oas.annotations.media.Schema;

public class GameListDTO {
	@Schema(description = "List ID", example = "2")
	private Long id;
	
	@Schema(description = "List name", example = "Action RPG")
	private String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
}
