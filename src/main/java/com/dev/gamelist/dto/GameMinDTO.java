package com.dev.gamelist.dto;

import com.dev.gamelist.entities.Game;
import com.dev.gamelist.projections.GameMinProjection;

import io.swagger.v3.oas.annotations.media.Schema;

public class GameMinDTO {
	@Schema(description = "Game's ID", example = "4")
	private Long id;
	
	@Schema(description = "Game's name", example = "Super Mario")
	private String title;
	
	@Schema(description = "Game's year of release", example = "2025")
	private Integer year;
	
	@Schema(description = "URL of game cover", example = "https://superMarioCoverSample.com/fakeurl.png")
	private String imgUrl;
	
	@Schema(description = "Short description of the game", example = "Super Mario is a classic platformer game series featuring Mario, a plumber who embarks on adventures to rescue Princess Peach from Bowser.")
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
	
	
	
}
