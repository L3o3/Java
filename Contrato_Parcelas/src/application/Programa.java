package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelas;
import services.ServicoContrato;
import services.ServicoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato obj = new Contrato(numero, data, valorTotal);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());
		
		servicoContrato.processaContrato(obj, n);
		
		System.out.println("Parcela: ");
		for (Parcelas parcelas : obj.getParcelas()) {
			System.out.println(parcelas);
		}
		
		sc.close();
	}

}
