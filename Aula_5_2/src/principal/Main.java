package principal;

import java.util.Scanner;

import Entidade.funcionario;
import Entidade.clt;
import Entidade.pj;
import Entidade.enums.Cargo;

public class Main {

	public static void Main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Bem vindo");
		System.out.println("escolha a opção respectiva a qual sua forma de trabalho");
		System.out.println("1:CLT\n" + "2:PJ");
		int escolha = scn.nextInt();

		if (escolha == 1) {

			System.out.println("Digite seu cargo\n" + "1:Professor\n" + "2:Desenvolvedor\n" + "3:Contador");
			int cargo = scn.nextInt();

			if (cargo == 1) {

				System.out.println("Digite seu nome");
				String nome = scn.next();

				System.out.println("Digite seu salario");
				double salario = scn.nextDouble();
				
				System.out.println("Digite seu convênio");
				double convenio = scn.nextDouble();
				 

				clt x = new clt(nome, salario, cargo Professor, convenio);

				System.out.println(x + " Salario Final =  " + x.receber());

			} else if (cargo == 2) {

				System.out.println("Digite seu nome");
				String nome = scn.next();

				System.out.println("Digite seu salario");
				double salario = scn.nextDouble();
				
				System.out.println("Digite seu convênio");
				double convenio = scn.nextDouble();

				clt x = new clt(nome, salario, Cargo.Desenvolvedor,convenio);

				System.out.println(x + " salario final = "+x.receber());

			} else if (cargo == 3) {

				System.out.println("Digite seu nome");
				String nome = scn.next();

				System.out.println("Digite seu salario");
				double salario = scn.nextDouble();
				
				System.out.println("Digite seu convênio");
				double convenio = scn.nextDouble();

				clt x = new clt(nome, salario, Cargo.Contador,convenio);

				System.out.println(x + " Salario final = " + x.receber());

			} else {
				System.out.println("Você não escolheu as opções fornecidas");
			}
		}

		if (escolha == 2) {

			System.out.println("Digite seu cargo\n" + "1:Professor\n" + "2:Desenvolvedor\n" + "3:Contador");
			int cargo1 = scn.nextInt();

			if (cargo1 == 1) {

				System.out.println("Digite seu nome");
				String nome = scn.next();

				System.out.println("Digite seu salario");
				double salario = scn.nextDouble();
				
				System.out.println("Digite o valor do adicional");
				double adicional = scn.nextDouble();

				pj x = new pj(nome, salario, Cargo.Professor,adicional);

				System.out.println(x + " Salario final = " + x.receber());

			} else if (cargo1 == 2) {

				System.out.println("Digite seu nome");
				String nome = scn.next();

				System.out.println("Digite seu salario");
				double salario = scn.nextDouble();
				
				System.out.println("Digite o valor do adicional");
				double adicional = scn.nextDouble();

				pj x = new pj(nome, salario, Cargo.Desenvolvedor,adicional);

				System.out.println(x + " Salario final = " + x.receber(salario));

			} else if (cargo1 == 3) {

				System.out.println("Digite seu nome");
				String nome = scn.next();

				System.out.println("Digite seu salario");
				double salario = scn.nextDouble();
				
				System.out.println("Digite o valor do adicional");
				double  adicional = scn.nextDouble();

				pj x = new pj(nome, salario, Cargo.Contador,adicional);

				System.out.println(x + " Salario final = " + x.receber());

			}
		}

	}
}