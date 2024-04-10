package com.kscorp.ksawards.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kscorp.ksawards.dto.RecordDTO;
import com.kscorp.ksawards.dto.RecordInsertDTO;
import com.kscorp.ksawards.entities.Game;
import com.kscorp.ksawards.entities.Record;
import com.kscorp.ksawards.repositories.GameRepository;
import com.kscorp.ksawards.repositories.RecordRepository;


@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired 
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert (RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}
