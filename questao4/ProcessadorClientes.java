package br.edu.ifpb.poo;


import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class ProcessadorClientes
{

	public ProcessadorClientes(){
		super();
	}
	Set<Cliente> clientes = new HashSet<>();
	
	
	public Set<Cliente> lerTodosClientes(Path origem) {


		try(FileReader fr = new FileReader(origem.toString());
			BufferedReader br = new BufferedReader(fr)
		) {

			String linha = null;
			while((linha=br.readLine())!=null){
				Cliente qualquer = new Cliente();
				String[] string_separada = linha.split(";");
				qualquer.setCódigo(string_separada[0]);
				qualquer.setNome(string_separada[1]);
				qualquer.setSobrenome(string_separada[2]);
				qualquer.setIdade(string_separada[3]);
				qualquer.setEndereço(string_separada[4]);
				qualquer.setCidade(string_separada[5]);
				qualquer.setEstado(string_separada[6]);
				qualquer.setCódigo_postal(string_separada[7]);

				clientes.add(qualquer);
			}

		}
		catch (FileNotFoundException e){
			System.out.println("não foi possível achar o arquivo");
		}
		catch (IOException e){
			System.out.println("Erro de leitura");
		}
		this.clientes = clientes;
		return clientes;
	}
	
	
	
	public void gravarClientesOrdenadosPor(Path destino, Comparator<Cliente> comparator) {
		Set<Cliente> setcliente = new TreeSet<>(comparator);
		try(FileWriter fw = new FileWriter(destino.toString());
			BufferedWriter bw = new BufferedWriter(fw))
		{
			setcliente.addAll(clientes);
			for(Cliente i:setcliente) {
				bw.write(i.toString());
				bw.newLine();
			}
		}
		catch (IOException e){
			System.out.println("Erro de escrita");
		}
	}



//	public Map<Integer, List<Cliente>> agruparClientesPorIdade() {
//		Map <Integer,List<Cliente>> mapa = new HashMap<>();
//		for (Cliente i:clientes){
//			ArrayList<Cliente> array = new ArrayList<>();
//			mapa.put(Integer.parseInt(i.getIdade()), array);
//			mapa.put(i.getIdade(),)
//		}
//	}
//
//
//
//	public void gravarMapaClientes(Path parameter) {
//		// TODO implement me
//		return null;
//	}
	
}

