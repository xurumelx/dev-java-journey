package exercicios.ifelse;

import java.util.Scanner;

public class lanche {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int id, quantidade;
        double total;

        System.out.println("CÓDIGO   ESPECIFICAÇÃO    PREÇO");
        System.out.println(" 1      Cachorro Quente  R$ 4,00");
        System.out.println(" 2       X - Salada      R$ 4,50");
        System.out.println(" 3       X - Bacon       R$ 5,00");
        System.out.println(" 4       Torrada Simples R$ 2,00 ");
        System.out.println(" 5       Refrigerante    R$ 1,50");
        System.out.println("Insira o id do lanche desejado: ");
        id = sc.nextInt();
        System.out.println("Informe a quantidade desejada: ");
        quantidade = sc.nextInt();

        switch (id) {
            case 1:
            total = 4 * quantidade;
            System.out.println("Valor a pagar: " + total);
            break;

            case 2:
            total = 4.50 * quantidade;
            System.out.println("Valor a pagar: " + total);
            break;

            case 3:
            total = 5.00 * quantidade;
            System.out.println("Valor a pagar: " + total);
            break;

            case 4:
            total = 2.00 * quantidade;
            System.out.println("Valor a pagar: " + total);
            break;

            case 5:
            total = 1.50 * quantidade;
            System.out.println("Valor a pagar: " + total);
            break;

            default:
                System.out.println("Id invalido!");
                break;
        }
        }
    }

