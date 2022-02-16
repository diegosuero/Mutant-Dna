package com.example.meli.MutantDna.domain;

import java.lang.reflect.Constructor;
import java.util.List;

public class Dna {
    public List<String> dna;
    public Boolean isMutant;
    public int ocurrences = 0;

    
    public List<String> getSequence() {
        return dna;
    }
    public void setSequence(List<String> sequence) {
        this.dna = sequence;
    }

    public void setMutant(boolean isMutant){
        this.isMutant=isMutant;
    }

    @Override
    public String toString() {
        return "Sequence = " + this.dna.toString()+ "Mutant = "+ this.isMutant;
    }
    public Dna(List<String> sequence) {
        this.dna = sequence;
    }
    public Dna(List<String> sequence, Boolean isMutant,int ocurrences) {
        this.dna = sequence;
        this.isMutant = isMutant;
        this.ocurrences= ocurrences;

    }
    
}
