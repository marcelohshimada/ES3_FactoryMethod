package model;

public class FuncionarioTempoIntegral extends Funcionario {
	
	private int bancoHoras;

	public int getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(int bancoHoras) {
		this.bancoHoras = bancoHoras;
	}

	@Override
	public String toString() {
		return "FuncionarioTempoIntegral [bancoHoras=" + bancoHoras + "]";
	}
	
	

}
