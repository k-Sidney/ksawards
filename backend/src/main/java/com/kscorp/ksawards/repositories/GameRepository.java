package com.kscorp.ksawards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kscorp.ksawards.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
