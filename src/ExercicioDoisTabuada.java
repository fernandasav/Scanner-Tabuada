import java.util.Scanner;

//Escreva um programa que informa a tabuada de multiplicação, de um número informado (entre 1-10).

public class ExercicioDoisTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-Vindo ao programa de tabuada!");
        System.out.println("Informe um número entre 1 a 10 para continuar: ");
        double numeroInformado = sc.nextDouble();

        System.out.println("A tabuada do número " + numeroInformado + " é:");
        System.out.println("1 x " + numeroInformado + " = " + 1*numeroInformado);
        System.out.println("2 x " + numeroInformado + " = " + 2*numeroInformado);
        System.out.println("3 x " + numeroInformado + " = " + 3*numeroInformado);
        System.out.println("4 x " + numeroInformado + " = " + 4*numeroInformado);
        System.out.println("5 x " + numeroInformado + " = " + 5*numeroInformado);
        System.out.println("6 x " + numeroInformado + " = " + 6*numeroInformado);
        System.out.println("7 x " + numeroInformado + " = " + 7*numeroInformado);
        System.out.println("8 x " + numeroInformado + " = " + 8*numeroInformado);
        System.out.println("9 x " + numeroInformado + " = " + 9*numeroInformado);
        System.out.println("10 x " + numeroInformado + " = " + 10*numeroInformado);
        System.out.println("Obrigada por usar nosso programa de tabuada!");
    }
}
