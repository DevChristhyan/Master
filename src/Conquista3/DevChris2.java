package Conquista3;

import java.util.Scanner;

public class DevChris2 {
    public static void main(String[] args) {
//Criar um código que pede para o usuário inserir um valor numérico de 1 a 10, e caso o valor digitado seja diferente desse intervalo,
//ele deve exibir uma mensagem pedindo para inserir o valor correto. O PROGRAMA NÃO PODE ENCERRAR ATÉ O USUÁRIO

        Scanner scan = new Scanner(System.in);

        int valor = 0;

        System.out.println("Hi brother");

        System.out.println("");

        System.out.println("Enter a value of 1 á 10 please");
        valor = scan.nextInt();

        while (valor >=10) {
            System.out.println(valor >=10);
            System.out.println(valor <=10);;


        }
    }
}