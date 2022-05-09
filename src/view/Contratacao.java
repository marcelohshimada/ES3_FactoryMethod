package view;

import controller.ContrataEstagiario;
import controller.ContrataTempoIntegral;
import controller.ContrataTempoParcial;
import controller.ContrataTemporario;
import model.Funcionario;

public class Contratacao {

	public static void main(String[] args) {
		ContrataTempoIntegral integral = new ContrataTempoIntegral();
		ContrataTempoParcial parcial = new ContrataTempoParcial();
		ContrataTemporario temp = new ContrataTemporario();
		ContrataEstagiario estag = new ContrataEstagiario();

		Funcionario funcionario = null;
		int tipoFuncionario = 4;

		switch (tipoFuncionario) {
		case 1:
			funcionario = integral.inicializaFuncionario();
			break;

		case 2:
			funcionario = parcial.inicializaFuncionario();
			break;

		case 3:
			funcionario = temp.inicializaFuncionario();
			break;

		case 4:
			funcionario = estag.inicializaFuncionario();
			break;

		default:
			break;
		}
		System.out.println(funcionario);
	}
}
