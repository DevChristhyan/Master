package Projetos;

import javax.swing.*;
import java.util.Scanner;

public class Junção {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite sua senha, para entrar no App de IMC : ");
        int contador = 1;

        while (!senha.equals("devchris") && contador <= 2) {
            senha = JOptionPane.showInputDialog("Senha Incorreta, Tente novamente :\nTentativas restantes : " + (3 - contador));
            contador++;
        }

        System.out.println();
        if (senha.equals("devchris")) {
            JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Bloqueado (Senha Incorreta)");

        }


        Scanner scan = new Scanner(System.in);

        double alturaEmMetros;
        double pesoKg;
        double imc;

        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo, bora calcular esse IMC?!");

        JOptionPane.showMessageDialog(null, "O índice de massa corporal é uma medida internacional usada para calcular se uma pessoa está no peso ideal.");

        JOptionPane.showMessageDialog(null, "Por Favor senhor insira sua altura:");
        alturaEmMetros = scan.nextDouble();

        System.out.println("Por favor, agora inserira peso.");
        pesoKg = scan.nextDouble();

        imc = pesoKg / (alturaEmMetros * alturaEmMetros);

        System.out.println(imc);

        System.out.println("");

        if (imc < 18.5)
            System.out.printf("IMC: %2f\baixo do peso - ➢ Vá comer mlk.\n", imc);
        else if (imc >= 18.5 && imc < 25)
            System.out.printf("IMC: %2f\tPeso normal - Mantenha o peso.\n", imc);

        else if (imc >= 25 && imc < 30)
            System.out.printf("IMC: %2f\tSobrepeso - ➢ Tá um pouco acima em gordin\n", imc);

        else if (imc >= 30 && imc < 35)
            System.out.printf("IMC: %2f\tObesidade grau 1 - Vishh gordin dlç\n", imc);

        else if (imc >= 35 && imc < 40)
            System.out.printf("IMC: %2f\tObesidade grau 2 - Tem q fechar as boca mofi\n", imc);

        else if (imc >= 40 && imc > 40)
            System.out.printf("IMC: %2f\tObesidade grau 3 - Tá andando como? gordão em Zé\n", imc);


        System.out.println("Volte sempre");


    }

}

