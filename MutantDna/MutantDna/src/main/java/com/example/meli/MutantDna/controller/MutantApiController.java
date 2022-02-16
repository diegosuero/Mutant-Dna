package com.example.meli.MutantDna.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meli.MutantDna.domain.Dna;
import com.example.meli.MutantDna.services.sequencerService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mutant")
public class MutantApiController {

    @GetMapping()
    public String getPage() {
        try {
            return "Welcome";
        } catch (Exception e) {
            return "error";
        }
    }

    @PostMapping("/")
	public ResponseEntity<String> isMutant(@RequestBody Dna dna) {
        try {
            sequencerService sequencerService = new sequencerService();
            boolean isMutant = sequencerService.isMutant(dna);
            if (isMutant) {
                dna.setMutant(true);
                return ResponseEntity.ok().build();
            } else {
                dna.setMutant(false);
                return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.toString());
            
        }
		
	}
}

