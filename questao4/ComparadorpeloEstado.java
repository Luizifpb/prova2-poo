package br.edu.ifpb.poo;

import java.util.Comparator;

public class ComparadorpeloEstado implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        if (o1.getEstado().charAt(0)<o2.getEstado().charAt(0)) return -1;
        else if (o1.getEstado().charAt(0)>o2.getEstado().charAt(0)) return 1;
        return 0;
    }
}
