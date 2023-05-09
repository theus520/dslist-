package com.rabelo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabelo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
