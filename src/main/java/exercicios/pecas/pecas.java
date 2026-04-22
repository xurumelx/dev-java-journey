package exercicios.pecas;

import java.util.Scanner;

public class pecas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int id1, id2;
    int num_pecas1, num_pecas2;
    double valor_unit1, valor_unit2;

    id1 = sc.nextInt();
    num_pecas1 = sc.nextInt();
    valor_unit1 = sc.nextDouble();

    id2 = sc.nextInt();
    num_pecas2 = sc.nextInt();
    valor_unit2 = sc.nextDouble();

    double total = (num_pecas1 * valor_unit1) + (num_pecas2 * valor_unit2);

    System.out.printf("Valor a pagar: R$ %.2f%n", total);

    sc.close();

    }
}
