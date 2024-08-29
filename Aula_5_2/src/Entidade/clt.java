package Entidade;

import Entidade.funcionario;
import Entidade.enums.cargo;

public class clt extends funcionario {

	private double convenio;

	public clt(String nome, double salario, cargo cargo, double convenio) {
		super(nome, salario, cargo);
		this.convenio = convenio;
	}

	public double receber() {
		return super.receber(salario) - convenio;

	}

}