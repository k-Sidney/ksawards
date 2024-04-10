package com.kscorp.ksawards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kscorp.ksawards.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
