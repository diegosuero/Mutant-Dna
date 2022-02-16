package com.example.meli.MutantDna.services;

import com.example.meli.MutantDna.domain.Dna;

import org.apache.tomcat.util.buf.StringUtils;

public class horizontalSequencer implements sequencer{
    

    @Override
    public int findSequences(Dna dna) {
        int sequences = 0;
        for (String dnaString : dna.dna) {
            String[] MuttantSequences = {"AAAA","TTTT","CCCC","GGGG"};
            for (String string : MuttantSequences) {
                sequences += org.springframework.util.StringUtils.countOccurrencesOf(dnaString, string);
            }
        }
        return sequences;
    }

    @Override
    public int findSequences(Dna dna, int row, int col, String direction) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}
