import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for(int i = 0; i< n; i++ ){
            sc.nextLine();
            System.out.println("Dados da "+ (i+1) + "a pessoa");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(name, idade, altura);
        }

        // somando as alturas

        double soma = 0.0;
        for(int i = 0; i<n; i++){
            soma += vect[i].getAltura();
        }
        //media da altura
        double avg = soma / vect.length;

        System.out.printf("Altura média: %.2f metros %n", avg);

        int contMenores16 = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16) {
                contMenores16++;
                System.out.println("Menor de 16 anos: " + vect[i].getName());
            }
        }


        // Calculando a porcentagem
        double porcento = (double) contMenores16 / n * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", porcento);

        sc.close();
    }
}