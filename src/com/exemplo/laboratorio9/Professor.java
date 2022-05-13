package com.exemplo.laboratorio9;

public class Professor extends Pessoa {
	private float Salario;
	private String Disciplina;
	
	public Professor(String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario, String disciplina ) {
		super(nome, idade, sexo, new Rg(numeroRG, dataNasc));
		this.Salario = salario;
		this.Disciplina = disciplina;
	}

	public float getSalario() {
		return Salario;
	}
	public void setSalario(float Salario) {
		this.Salario = Salario;
	
	}
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String Disciplina) {
		this.Disciplina = Disciplina;
	}
	
	public void falar(String fala) {
		System.out.println(getNome() + ": " + fala);
		
	}
	public void mostrarDados() {
		System.out.println();
		System.out.println("----- Professor: " + getNome() + "-----");
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo " + getSexo());
		System.out.println("Salario " + getSalario());
		System.out.println("Disciplina " + getDisciplina());
		System.out.println("Rg " + getRg().getNumero());
		System.out.println("Data de Nascimento " + getRg().getDataNasc());
		
		
	}
		
}
