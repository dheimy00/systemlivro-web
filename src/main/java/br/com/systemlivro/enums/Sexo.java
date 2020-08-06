package br.com.systemlivro.enums;

public enum Sexo {
	
	MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String sexo;
	
	public String getSexo() {
		return sexo;
	}
	
	Sexo(String sexo){
		this.sexo = sexo;
	}

}
