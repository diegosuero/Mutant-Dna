package com.example.meli.MutantDna.services;

import com.example.meli.MutantDna.domain.Dna;

public class verticalSequencer implements sequencer {

    @Override
    public int findSequences(Dna dna) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int findSequences(Dna dna, int row, int col, String direction) {
        char currentChar = dna.dna.get(row).charAt(col);
        if (row!=0 && currentChar==dna.dna.get(row-1).charAt(col)) {
            return 0;
        }
        int size = dna.dna.size();
            if (row+4<size) {
                
                int iterRow =row+1;
                int found = 1;
                
                while ( iterRow<size && dna.dna.get(iterRow).charAt(col)==currentChar && found<4) {
                    found+=1;
                    iterRow+=1;
                }
                if (found==4) {
                    return 1;
                }
            }
        
        return 0;
    }
}
