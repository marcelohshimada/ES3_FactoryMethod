package controller;

import model.Funcionario;
import model.FuncionarioTempoParcial;

public class ContrataTempoParcial extends FuncionarioController {

	public Funcionario inicializaFuncionario() {
		FuncionarioTempoParcial parcial = new FuncionarioTempoParcial();
		parcial.setId(3);
		parcial.setNome("Zé");
		parcial.setHoraEntrada(10);
		parcial.setHoraSaida(18);
		parcial.setSalario(2500);
		return parcial;
	}
}