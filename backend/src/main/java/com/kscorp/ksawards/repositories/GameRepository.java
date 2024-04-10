package com.kscorp.ksawards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kscorp.ksawards.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
