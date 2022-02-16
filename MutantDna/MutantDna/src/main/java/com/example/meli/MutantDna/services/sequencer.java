package com.example.meli.MutantDna.services;

import com.example.meli.MutantDna.domain.Dna;

public interface sequencer {
    public int findSequences (Dna dna);
    public int findSequences (Dna dna,int row, int col, String direction);
    
}
