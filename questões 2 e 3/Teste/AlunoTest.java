package br.edu.ifpb.poo;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class AlunoTest {

    @Test
    public void TestaClones() {
        LinkedList<Aluno> lista = new LinkedList<>();
        Collections.addAll(lista, new Aluno("bruno", 1.73), new Aluno("josé", 1.75), new Aluno("ana", 1.77));
        Aluno cloneAna = new Aluno("ana", 1.77);
        assertTrue(lista.contains(cloneAna));
        assertFalse(lista.contains(new Aluno("michael jackson", 1.8)));
    }

    @Test
    public void TestaOrdenação(){
        LinkedList<Aluno> lista = new LinkedList<>();
        Collections.addAll(lista, new Aluno("bruno", 1.73), new Aluno("josé", 1.75), new Aluno("ana", 1.77));
        lista.sort(new ComparatorNome());
        assertEquals(lista.get(0).toString(),"Nome:ana Altura:1.77");
        assertEquals(lista.get(1).toString(),"Nome:bruno Altura:1.73");
        assertEquals(lista.get(2).toString(),"Nome:josé Altura:1.75" );

        lista.sort(new ComparatorAltura());
        assertEquals(lista.get(0).toString(),"Nome:bruno Altura:1.73");
        assertEquals(lista.get(1).toString(),"Nome:josé Altura:1.75" );
        assertEquals(lista.get(2).toString(),"Nome:ana Altura:1.77");
    }
}