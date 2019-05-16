package br.edu.ifpb.poo;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        if(o1.nome.charAt(0)<o2.nome.charAt(0)) return -1;
        else if(o1.nome.charAt(0)>o2.nome.charAt(0)) return 1;
        return 0;
    }
}
