package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account acc = new Account();

		System.out.println("Informe os dados da conta:");
		System.out.print("Numero: ");
		acc.setNumber(sc.nextInt());
		System.out.print("Titular: ");
		acc.setHolder(sc.next());
		System.out.print("Saldo inicial: ");
		acc.setBalance(sc.nextDouble());
		System.out.print("Limite de saque: ");
		acc.setWithdrawLimit(sc.nextDouble());

		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.println("Novo Saldo: R$" + String.format("%.2f", acc.getBalance()));
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
