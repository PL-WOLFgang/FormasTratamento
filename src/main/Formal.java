package main;

public class Formal implements FormatadorNome{

	private String substantivo;
	
	public Formal(boolean masculino) {
		// TODO Auto-generated constructor stub
		this.substantivo = masculino? "Sr.": "Sra.";
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		// TODO Auto-generated method stub
		return this.getSubstantivo()+" "+sobrenome;
	}
	
	public String getSubstantivo(){
		return substantivo;
	}
	

}
