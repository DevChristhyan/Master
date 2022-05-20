package Conquista1;

public class DevChris6 {
    public static void main(String[] args) {
        int valor = 50;
        double valorQuebrado = 5.5;
        short numeroMenor = 120;
        long cagar = 789456123;
        float numeroDecimalPequeno = 4.4F;

        boolean isvalorMaiorQuenumeroMenor = 50 > 120;
        boolean iscagarMaiorQuenumeroDecimalPequeno = 789456123 > 4.4F;
        boolean isnumeroMenorIgualcagar = 120 == 789456123;
        boolean isnumeroDecimalPequenoMenorQueValorQuebrado = 4.4F < 5.5;
        boolean isnumeroMenorMenorQueCagar = 120 > 789456123;


        System.out.println("isvalorMaiorQuenumeroMenor " + isvalorMaiorQuenumeroMenor);

        System.out.println("iscagarMaiorQuenumeroDecimalPequeno " + iscagarMaiorQuenumeroDecimalPequeno);

        System.out.println("isnumeroMenorIgualcagar " + isnumeroMenorIgualcagar);

        System.out.println("isnumeroDecimalPequenoMenorQueValorQuebrado " + isnumeroDecimalPequenoMenorQueValorQuebrado);

        System.out.println("isnumeroMenorMenorQueCagar " + isnumeroMenorMenorQueCagar);
    }
}
