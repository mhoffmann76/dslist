package com.devsuperior.dslist.dto;

import java.util.Objects;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;

	public GameListDTO() {

	}

	public GameListDTO(GameList entity) {

		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	

}
