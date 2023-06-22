package com.airfranceklm.fasttrack.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airfranceklm.fasttrack.assignment.repository.HolidayRepository;
import com.airfranceklm.fasttrack.assignment.resources.Holiday;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class HolidaysApi {
	
	@Autowired
	private HolidayRepository holidayRepository;

    @GetMapping("/holidays/{id}")
    public ResponseEntity<List<Holiday>> getHolidaysOf(@PathVariable("id") String id) {
        return new ResponseEntity<List<Holiday>>(holidayRepository.findByEmployeeId(id), HttpStatus.OK);
    }
    
    @GetMapping("/holidays/delete")
    public ResponseEntity<List<Holiday>> deleteHolidays() {
    	holidayRepository.deleteAll();
        return new ResponseEntity<List<Holiday>>(HttpStatus.OK);
    }
}
