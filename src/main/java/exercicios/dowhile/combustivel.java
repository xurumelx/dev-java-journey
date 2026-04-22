package exercicios.dowhile;
import java.util.Scanner;

public class combustivel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;
        int opcao= 0;

        while(opcao != 4){
            System.out.println("1.Alcool/n 2.Gasolina/n 3.Diesel/n 4.Fim");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    alcool = alcool + 1;
                    break;

                case 2:
                    gasolina = gasolina + 1;
                    break;

                case 3:
                    diesel = diesel + 1;
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Digite um número válido!");
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: "+ alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Diesel: "+ diesel);

        sc.close();
    }
}