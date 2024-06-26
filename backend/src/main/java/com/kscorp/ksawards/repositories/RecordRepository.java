package com.kscorp.ksawards.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kscorp.ksawards.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

	@Query("SELECT obj FROM Record obj WHERE"
			+ "(coalesce(:min, null) IS NULL OR obj.moment >= :min) AND "
			+ "(coalesce(:max, null) IS NULL OR obj.moment <= :max)")
	Page<Record> findByMoments(Instant min, Instant max, PageRequest pageRequest);
}
