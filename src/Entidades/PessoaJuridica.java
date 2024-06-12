package Entidades;

public class PessoaJuridica extends Contribuinte {

	
	public Integer NumeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(name, rendaAnual);
		NumeroDeFuncionarios = numeroDeFuncionarios;
	}



	public Integer getNumeroDeFuncionarios() {
		return NumeroDeFuncionarios;
	}


	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		NumeroDeFuncionarios = numeroDeFuncionarios;
	}


	@Override
	public double ImpostoPago() {
      double ImpostoTotal = 0.0;
		if (NumeroDeFuncionarios <= 0.10) {
			ImpostoTotal += RendaAnual * 0.16;
		}else {
			ImpostoTotal += RendaAnual * 0.14;
		}
		
		
		return ImpostoTotal;
	}

}
