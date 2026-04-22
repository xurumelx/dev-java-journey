package exercicios.ifelse;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.println("Digite um numero: ");
    num = sc.nextInt();

    if(num > 0){
        System.out.println("Número positivo!");
    }
    else{
        System.out.println("Número negativo");
    }
    }
}
