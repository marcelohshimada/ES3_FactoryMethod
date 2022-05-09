package controller;

import model.Funcionario;
import model.FuncionarioTempoIntegral;

public class ContrataTempoIntegral extends FuncionarioController {

	public Funcionario inicializaFuncionario() {
		FuncionarioTempoIntegral integral = new FuncionarioTempoIntegral();
		integral.setId(1);
		integral.setNome("Hideki");
		integral.setSalario(4000);
		integral.setBancoHoras(20);
		return integral;
	}
}
