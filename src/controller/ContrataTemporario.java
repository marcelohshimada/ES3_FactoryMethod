package controller;

import model.Funcionario;
import model.FuncionarioTemporario;

public class ContrataTemporario extends FuncionarioController {

	public Funcionario inicializaFuncionario() {
		FuncionarioTemporario temp = new FuncionarioTemporario();
		temp.setId(3);
		temp.setNome("Turista");
		temp.setSalario(3000);
		temp.setDia(01);
		temp.setMes(11);
		temp.setAno(2022);
		return temp;
	}
}
