package br.edu.ifpb.poo;
import java.nio.file.Paths;
import java.io.File;
import java.util.Set;


public class ProcessadorDemo
{

	public static void main(String[] args) {
		ProcessadorClientes pc = new ProcessadorClientes();
		Set<Cliente> clientes = pc.lerTodosClientes(Paths.get("sources\\clientes.txt"));
		System.out.println(clientes);
		pc.gravarClientesOrdenadosPor(Paths.get("sources\\clientesordenadosidade.txt"), new Comparadorpelaidade());


	}
	
}

