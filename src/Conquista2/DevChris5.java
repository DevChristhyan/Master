package Conquista2;

public class DevChris5 {
    public static void main(String[] args) {

        //TODO se atentar ao enunciado da questão. "verifica se o valor de uma variável é igual ao case. (1, 2, 3)."

        String processador = "2";

        switch (processador) {

            case "1" :
                System.out.println("Intel Xeon Platinum");
                break;

            case "2":
                System.out.println("AMD Ry-zen");
                break;

            case "3":
                System.out.println("Intel Celeron");
                break;

            default:
                System.out.println("O valor não é compatível");



        }
    }
}
