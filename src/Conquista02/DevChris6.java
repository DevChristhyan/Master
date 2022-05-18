package Conquista02;

//TODO Exercício sem o enunciado. Adicionar o texto do exercicío como comentário /**
// Se atentar a descrição do exercício "verifica se o valor de uma variável é igual ao case (a, b, c e default)"
public class DevChris6 {
    public static void main(String[] args) {

        String car = "Jaguar";

        switch (car) {

            case "Mercedes":
                System.out.println("Mercedes");
                break;

            case "Tesla":
                System.out.println("Tesla");
                break;

            case "Ferrari":
                System.out.println("Ferrari");
                break;

            default:
                System.out.println("O valor não é compatível");
        }
    }
}
