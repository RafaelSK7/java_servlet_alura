package br.com.alura.gerenciador.classes;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	public static List<Empresa> lista = new ArrayList<>();
	
	static {
		
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		
		lista.add(empresa);
	
	}
	
	public List<Empresa> getEmpresas(){
		
		return Banco.lista;
		
	}

}
