package controller;

import model.Funcionario;
import model.FuncionarioEstagiario;

public class ContrataEstagiario extends FuncionarioController {

	public Funcionario inicializaFuncionario() {
		FuncionarioEstagiario estag = new FuncionarioEstagiario();
		estag.setId(4);
		estag.setNome("Marcelo");
		estag.setSalario(2000);
		estag.setInstituicao("Fatec Zona Leste");
		return estag;
	}
}
