package br.edu.ifpb.poo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class UsaLinkedList
{
    public static void main( String[] args )
    {
        LinkedList<Aluno> lista = new LinkedList<>();
        Collections.addAll(lista, new Aluno("bruno", 1.73), new Aluno("josé", 1.75), new Aluno("ana", 1.77));
        Aluno cloneAna = new Aluno("ana", 1.77);
        if(lista.contains(cloneAna)) System.out.println("A lista já contém Ana!");

        lista.sort(new ComparatorNome());
        for(Aluno a:lista) System.out.println(a.toString());

        lista.sort(new ComparatorAltura());
        for(Aluno a:lista) System.out.println(a.toString());

    }
}
