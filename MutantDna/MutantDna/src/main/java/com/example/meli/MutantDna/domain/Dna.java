package com.example.meli.MutantDna.domain;

import java.lang.reflect.Constructor;
import java.util.List;

public class Dna {
    public List<String> sequence;
    public Boolean isMutant;
    public int ocurrences = 0;

    
    public List<String> getSequence() {
        return sequence;
    }
    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "Sequence = " + this.sequence.toString();
    }
    public Dna(List<String> sequence) {
        this.sequence = sequence;
    }
    public Dna(List<String> sequence, Boolean isMutant,int ocurrences) {
        this.sequence = sequence;
        this.isMutant = isMutant;
        this.ocurrences= ocurrences;

    }
    
}
