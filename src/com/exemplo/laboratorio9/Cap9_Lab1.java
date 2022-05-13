package com.exemplo.laboratorio9;

public class Cap9_Lab1 {

	public static void main(String[] args) {
		Pessoa manuel = new Aluno("Manuel", 19, 'M', 521234567, "15/06/1993", 1099.0F, "Ciencia da computacao");
		Pessoa claudia = new Aluno("Claudia", 22, 'F',415678129, "12/08/1990" , 799.0F, "Administracao"); 
		Pessoa rafael = new Professor("Rafael", 38, 'M', 261454789, "05/02/1974", 2500.0F, "Portugues");
		
		rafael.falar("Manuel?");
		manuel.falar("Presente!");
		rafael.falar("Claudia?");
		claudia.falar("Presente!");
		
		rafael.mostrarDados();
		claudia.mostrarDados();
		manuel.mostrarDados();
	}

}
