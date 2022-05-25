package Conquista3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/*Criar um código que declara uma variável numérica de valor 0, e que utilizando o DO WHILE
adicionar valor a essa variável maior que 10. Essa variável deve ser utilizada numa comparação no DO WHILE e o código NÃO DEVE REPETIR a execução do DO WHILE.
 */
//TODO Errado. Se atentar ao exercício: " e que utilizando o DO WHILE adiciona valor a essa variável maior que 10."
public class DevChris3 {
    public static void main(String[] args) {

        int valor = 0;

        do {
            System.out.println(valor + 15);
            valor++;

        } while (valor >=10);
        System.out.println("Ok");


    }
}
