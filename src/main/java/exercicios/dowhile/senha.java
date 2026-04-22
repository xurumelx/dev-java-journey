package exercicios.dowhile;

import java.util.Scanner;

public class senha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int tentativa;

        do{
            tentativa = sc.nextInt();

            if(tentativa != senha){
                System.out.println("Senha inválida!");
            }
        } while(senha != tentativa );

        System.out.println("Acesso permitido!");


    }
}
