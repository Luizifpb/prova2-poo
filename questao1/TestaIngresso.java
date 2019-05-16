package br.edu.ifpb.poo;

/**
 * Hello world!
 *
 */
public class TestaIngresso
{
    public static void main( String[] args )
    {
        Adulto jose = new Adulto();
        Criança joe = new Criança();
        Idoso SeuAntonio = new Idoso();



        jose.setTipo_de_tarifa(new Tarifaadulto());
        System.out.println(jose.getPreco_ingresso());

        SeuAntonio.setTipo_de_tarifa(new Tarifaidoso());
        System.out.println(SeuAntonio.getPreco_ingresso());

        joe.setTipo_de_tarifa(new Tarifacriança());
        System.out.println(joe.getPreco_ingresso());

        SeuAntonio.setTipo_de_tarifa(new Semanadooscar());
        System.out.println(SeuAntonio.getPreco_ingresso());
    }
}
