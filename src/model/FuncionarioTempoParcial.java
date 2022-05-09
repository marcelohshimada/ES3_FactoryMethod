package model;

public class FuncionarioTempoParcial extends Funcionario {

	private int horaEntrada;
	private int horaSaida;

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	@Override
	public String toString() {
		return "FuncionarioTempoParcial [horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + "]";
	}

}
