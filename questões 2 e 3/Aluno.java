package br.edu.ifpb.poo;

import java.util.Objects;

public class Aluno {
    String nome;
    double altura;
    public Aluno(String n, double a){
        this.nome = n;
        this.altura = a;
    }

    @Override
    public String toString() {
        return
                "Nome:'" + nome  +
                " Altura:" + altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
