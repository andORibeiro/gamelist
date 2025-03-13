package com.dev.gamelist.dto;

import org.springframework.beans.BeanUtils;

import com.dev.gamelist.entities.Game;

import io.swagger.v3.oas.annotations.media.Schema;

/*
 * Patterning, Service returns DTO not entities
 * */
public class GameDTO {
	@Schema(description = "Game's ID", example = "4")
	private Long id;

	@Schema(description = "Game's title", example = "Super Mario")
	private String title;

	@Schema(description = "Game's year of release", example = "2025")
	private Integer year;

	@Schema(description = "Game's genre", example = "Platformer")
	private String genre;

	@Schema(description = "List of platforms the game is available on", example = "Nintendo Switch, PlayStation 5, PC")
	private String platforms;

	@Schema(description = "Game's score or rating", example = "9.5")
	private Double score;

	@Schema(description = "URL of game cover image", example = "https://superMarioCoverSample.com/fakeurl.png")
	private String imgUrl;

	@Schema(description = "Short description of the game", example = "Super Mario is a classic platformer game series featuring Mario, a plumber who embarks on adventures to rescue Princess Peach from Bowser.")
	private String shortDescription;

	@Schema(description = "Long description of the game", example = "Super Mario is a series of platform games developed by Nintendo. Players control Mario, who must navigate through various levels to save Princess Peach from Bowser. The series is known for its bright, colorful visuals and innovative gameplay mechanics.")
	private String longDescription;

	
	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this); //Copy the attributes from the entity to this DTO, getters and setters are mandatory to work
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
		
}
