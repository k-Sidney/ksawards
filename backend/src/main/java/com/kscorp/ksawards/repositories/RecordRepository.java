package com.kscorp.ksawards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kscorp.ksawards.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
