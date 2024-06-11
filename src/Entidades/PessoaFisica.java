package Entidades;

public class PessoaFisica extends Contribuinte {

	public Double GastosSaude;
	
	
	
	public PessoaFisica() {
		super();
		
	}
	
	
	
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		GastosSaude = gastosSaude;
	}




	public Double getGastosSaude() {
		return GastosSaude;
	}




	public void setGastosSaude(Double gastosSaude) {
		GastosSaude = gastosSaude;
	}




	@Override
	public double ImpostoPago() {
 	   double ImpostoTotal = 0.0;
		if (RendaAnual < 20000.00) {
			ImpostoTotal += RendaAnual * 15;
		}else {
			ImpostoTotal += (RendaAnual * 25) - (GastosSaude * 50);
		}
		
		return ImpostoTotal;
		
		
	}

}
