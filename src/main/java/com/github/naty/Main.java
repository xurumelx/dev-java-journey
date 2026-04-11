package com.github.naty;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        double horas_trabalhadas;
        double valor_hora;

        System.out.println("Número trabalhador: ");
        id = sc.nextInt();

        System.out.println("Horas trabalhadas: ");
        horas_trabalhadas = sc.nextDouble();

        System.out.println("Valor hora: ");
        valor_hora = sc.nextDouble();

        double salario = horas_trabalhadas * valor_hora;

        System.out.println("Id trabalhador: "+ id);
        System.out.printf("Salário: R$ %.2f%n", salario);

        sc.close();

    }
}

