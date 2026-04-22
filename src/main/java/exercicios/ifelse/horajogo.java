package exercicios.ifelse;

import java.util.Scanner;

public class horajogo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int hora_inicio, hora_final;

        hora_inicio = sc.nextInt();
        hora_final = sc.nextInt();

        int duracao;

        if(hora_inicio == hora_final){
            duracao = 24;
        }
        else if(hora_inicio < hora_final){
            duracao = hora_final - hora_inicio;
        }
        else {
            duracao = (24 - hora_inicio) + hora_final;
        }

        System.out.println("O jogo durou: " + duracao + " horas!");
    }
}
