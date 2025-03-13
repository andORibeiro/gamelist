package com.dev.gamelist.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class ReplacementDTO {
	@Schema(description = "Initial game's position on the list", example = "1")
	private Integer sourceIndex;
	
	@Schema(description = "Final game's position on the list", example = "4")
	private Integer destinationIndex;
	
	public Integer getSourceIndex() {
		return sourceIndex;
	}
	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}
	public Integer getDestinationIndex() {
		return destinationIndex;
	}
	public void setDestinationIndex(Integer destinationIndex) {
		this.destinationIndex = destinationIndex;
	}
	
	
}
