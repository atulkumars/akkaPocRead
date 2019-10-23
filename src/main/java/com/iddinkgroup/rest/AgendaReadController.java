package com.iddinkgroup.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iddinkgroup.entity.Agenda;
import com.iddinkgroup.repository.AgendaRepository;

@RestController
public class AgendaReadController {
	
    @Autowired
    private AgendaRepository agendaRepository;

    @GetMapping("/all")
    public List<Agenda> getAllAppointments() {
         return agendaRepository.findAll();
    }

}
