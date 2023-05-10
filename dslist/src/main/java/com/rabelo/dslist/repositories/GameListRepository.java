package com.rabelo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabelo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
