package Entidade;

import Entidade.funcionario;
import Entidade.enums.Cargo;

public class pj extends funcionario {

	private double adicional;

	public pj(String nome, double salario, Cargo cargo, double adicional) {
		super(nome, salario, cargo);
		this.adicional = adicional;
	}

	public double receber() {

		return super.receber(salario + adicional);

	}

}