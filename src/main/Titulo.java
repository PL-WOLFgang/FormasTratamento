package main;

public class Titulo  implements FormatadorNome{

	private String titulo;
	
	public Titulo(String titulo) {
		// TODO Auto-generated constructor stub
		this.titulo = titulo;		
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		// TODO Auto-generated method stub
		return this.getTitulo()+" "+nome+" "+sobrenome;
	}	
	
	public String getTitulo(){
		return titulo;
	}
}
