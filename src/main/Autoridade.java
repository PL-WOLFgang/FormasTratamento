package main;

public class Autoridade {
	
	private String nome; 
	private String sobrenome;
	private FormatadorNome formata;
	
	public Autoridade( String nome, String sobrenome) {
		// TODO Auto-generated constructor stub
		this.nome =  nome;	
		this.sobrenome = sobrenome;	
	}
	
	public String getTratamento(){
		return formata.formatarNome(this.nome, this.sobrenome);
	}
	
	
	public String getNome(){
		return nome != null? nome: "";
	}
	
	public String getSobrenome(){
		return sobrenome != null? sobrenome: "";
	}

}
