package com.example.meli.MutantDna.services;

import com.example.meli.MutantDna.domain.Dna;

public class diagonalSequencer implements sequencer {

    @Override
    public int findSequences(Dna dna) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int findSequences(Dna dna, int row, int col, String direction) {
        char currentChar = dna.dna.get(row).charAt(col);
        int size= dna.dna.size();
        switch (direction) {
            case "UP":
                if (col!=0 &&row!=size-1 && currentChar==dna.dna.get(row+1).charAt(col-1)) {
                    return 0;
                }
                if (row>2&&col+3<=size) {
                    int iterRow =row-1;
                    int iterCol =col+1;
                    int found = 1;
                    while (found<4 &&iterCol<size &&dna.dna.get(iterRow).charAt(iterCol)==currentChar) {
                        found+=1;
                        iterRow-=1;
                        iterCol+=1;
                    }
                    if (found==4) {
                        return 1;
                    }
                }
                break;
            default:
                if (col!=0 &&row!=0 && currentChar==dna.dna.get(row-1).charAt(col-1)) {
                    return 0;
                }
                if (row+3<=size&&col+3<=size) {
                    int iterRow =row+1;
                    int iterCol =col+1;
                    int found = 1;
                    while (found<4&& iterCol<size && dna.dna.get(iterRow).charAt(iterCol)==currentChar) {
                        found+=1;
                        iterRow+=1;
                        iterCol+=1;
                    }
                    if (found==4) {
                        return 1;
                    }
                }
                
                break;
        }
        return 0;
    }
    
}
