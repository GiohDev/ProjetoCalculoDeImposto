package Aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Contribuinte;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Contribuinte> list = new ArrayList<>();
		System.out.print("Digite o numero de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n ; i++) {
			
			System.out.println("Contribuinte # "+(i+1)+ " dados:");
			System.out.print("Pessoa Fisica ou juridica (f/j)?");			
			char escolha = sc.next().charAt(0);
			
			 
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if (escolha == 'f'){
					System.out.print("Gastos com saúde: ");
					Double gastosSaude = sc.nextDouble();
					
				PessoaFisica pf = new PessoaFisica(nome , rendaAnual , gastosSaude);
				list.add(pf);
			}else {
				System.out.println("Numero de funcionarios: ");
				Integer numeroDeFuncionarios = sc.nextInt();
				
				PessoaJuridica pj = new PessoaJuridica(nome , rendaAnual, numeroDeFuncionarios );
				list.add(pj);
		}
			
			
			
	}
            System.out.println("Impostos dos contribuintes:" );
            Double impostoTotal = 0.0;
			for (Contribuinte c : list) {
				System.out.println(c.getName() + "$ "+String.format("%.2f", c.ImpostoPago()));
				
			impostoTotal += c.ImpostoPago();
		}
		    System.out.print("Total dos impostos: " + String.format("%.2f", impostoTotal) );
		    
		    
		sc.close();
	
	}

}
