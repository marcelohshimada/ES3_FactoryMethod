package model;

public class FuncionarioEstagiario extends Funcionario {

	private String instituicao;

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	@Override
	public String toString() {
		return "FuncionarioEstagiario [instituicao=" + instituicao + "]";
	}
	
	
	
}
