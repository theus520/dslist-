package com.rabelo.dslist.dto;

import com.rabelo.dslist.entities.GameList;

public class GameListDTO {
	
	
	private Long id;
	private String nome;

	public GameListDTO() {
	
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	
}
