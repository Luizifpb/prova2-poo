package br.edu.ifpb.poo;

import java.util.Comparator;

public class ComparadorPeloNome implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        if (o1.getNome().charAt(0)<o2.getNome().charAt(0)) return -1;
        else if (o1.getNome().charAt(0)>o2.getNome().charAt(0)) return 1;
        return 0;
    }
}
