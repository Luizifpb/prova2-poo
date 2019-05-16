package br.edu.ifpb.poo;

import java.util.Comparator;

public class ComparatorAltura implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
       return Double.compare(o1.altura,o2.altura);
    }
}
