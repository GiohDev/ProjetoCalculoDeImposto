package Entidades;

public abstract class  Contribuinte {
	
	public String Name;
	public Double RendaAnual;
	
	
	public Contribuinte() {
		
	}


	public Contribuinte(String name, Double rendaAnual) {
		super();
		Name = name;
		RendaAnual = rendaAnual;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Double getRendaAnual() {
		return RendaAnual;
	}


	public void setRendaAnual(Double rendaAnual) {
		RendaAnual = rendaAnual;
	}

	public abstract double ImpostoPago();
		
	
	
}
