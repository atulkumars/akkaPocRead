package com.iddinkgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iddinkgroup.entity.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, String> {

}
