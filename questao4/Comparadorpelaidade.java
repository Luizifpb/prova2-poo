package br.edu.ifpb.poo;

import javax.print.DocFlavor;
import java.util.Comparator;

public class Comparadorpelaidade implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return Integer.compare(Integer.parseInt(o1.getIdade()),Integer.parseInt(o2.getIdade()));
    }
}
