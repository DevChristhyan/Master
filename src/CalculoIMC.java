import java.util.Scanner;

    /**
     * Cálculo IMC
     * IMC é a sigla para Índice de Massa Corpórea, parâmetro adotado pela Organização Mundial de
     * Saúde para calcular o peso ideal de cada pessoa.
     *
     * O índice é calculado da seguinte maneira:  Diz-se que o indivíduo tem peso normal quando o resultado do IMC está entre 18,5
     * e 24,9.
     *
     * Quer descobrir seu IMC? Insira seu peso e sua altura nos campos abaixo e compare com os
     * índices da tabela. Importante: siga os exemplos e use pontos como separadores.
     */


    public class CalculoIMC {

        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            double alturaEmMetros;
            double pesoKg;
            double imc;

            System.out.println("Olá, seja bem vindo, bora calcular esse IMC?!");

            System.out.println("");

            System.out.println("O índice de massa corporal é uma medida internacional usada para calcular se uma pessoa está no peso ideal.");

            System.out.println("");

            System.out.println("Por favor senhor(a), inserira sua altura.");
            alturaEmMetros = scan.nextDouble();

            System.out.println("Por favor, agora inserira peso.");
            pesoKg = scan.nextDouble();

            imc = pesoKg / (alturaEmMetros * alturaEmMetros);

            System.out.println(imc);

            System.out.println("");

            if(imc < 18.5)
                System.out.printf("IMC: %2f\baixo do peso - Dê preferência por alimentos in natura. ➢ Acrescente creme de leite ou mel junto às frutas ou salada de frutas. ➢ Aumente e varie o consumo de frutas e verduras durante o dia, no mínimo 3 porções. ➢ Faça pelo menos 3 refeições (café da manhã, almoço e jantar) e 2 lanches.\n", imc);
            else if(imc >= 18.5 && imc < 25)
                System.out.printf("IMC: %2f\tPeso normal - Mantenha o peso.\n", imc);

            else if(imc >= 25 && imc < 30)
               System.out.printf("IMC: %2f\tSobrepeso - ➢ Faça pelo menos 3 refeições (café da manhã, almoço e jantar) e 2 lanches. Para lanches e sobremesas prefira frutas. ➢ Coma em horários regulares, mastigando devagar e com atenção.\n", imc);

            else if(imc >= 30 && imc < 35)
                System.out.printf("IMC: %2f\tObesidade grau 1 - O tratamento da obesidade grau I deve ser baseada no tripé: dieta, exercício físico e medicação em longo prazo por se tratar de uma doença crônica.\n", imc);

            else if(imc >= 35 && imc < 40)
                System.out.printf("IMC: %2f\tObesidade grau 2 - Consuma carnes magras, de boi, frango sem pele ou peixe, preferindo preparações grelhadas, assadas ou cozidas, acrescentando pouco óleo, apenas no final do preparo.\n", imc);

            else if (imc >= 40 && imc > 40)
                System.out.printf("IMC: %2f\tObesidade grau 3 - Para emagrecer e combater a obesidade mórbida é fundamental fazer acompanhamento com um nutricionista para realizar reeducação alimentar.\n", imc);


            System.out.println("Volte sempre");




        }

        }
//TODO Remover comentários abaixo

                /**
                 * Melhorias
                 *
                 * 1. Adicionar um título ao programa
                 * 2. Dizer um pouco o que o sistema faz
                 * 3. Melhorar textos
                 * 4. Melhorar retorno do IMC
                 */

                /**
                 * Extra
                 *
                 * 1. Adicionar ao programa o quadro da interpretação do IMC
                 * 2. Dizer em qual classificação o usuário se encontra
                 */
