package com.example.meli.MutantDna.services;

import com.example.meli.MutantDna.domain.Dna;

public class sequencerService {
    public boolean isMutant(Dna dna) throws Exception{
        checkForConsistency(dna);
        int sequences = 0;
        horizontalSequencer horizontalSequencer = new horizontalSequencer();
        verticalSequencer verticalSequencer = new verticalSequencer();
        diagonalSequencer diagonalSequencer= new diagonalSequencer();
        sequences += horizontalSequencer.findSequences(dna);
        for(int row =0;row<dna.dna.size();row++){
            for(int column =0;column<dna.dna.size();column++){
                sequences+=verticalSequencer.findSequences(dna, row, column, "DOWN");
                sequences+=diagonalSequencer.findSequences(dna, row, column, "UP");
                sequences+=diagonalSequencer.findSequences(dna, row, column, "DOWN");
            }
        }
        return sequences>1;
    }

    public void checkForConsistency(Dna dna) throws Exception{
        for (String dnaString : dna.dna) {
            if(dnaString.length()!=dna.dna.size()){
                throw new Exception("DNA is Not Squared");
            }
            if(!dnaString.matches("[A,T,G,C]*")){
                throw new Exception("DNA data is Not consistent with nitrogenic base");
            }
        }
    }
}
