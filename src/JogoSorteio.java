import java.util.Scanner;

public class JogoSorteio {
    Sorteador sorteador = new Sorteador();
    Scanner scanner = new Scanner(System.in);

    public void inicio(){
        System.out.println("DESAFIO 2 - PRONTO PRA JOGAR");
        System.out.println("Quantidade de números para serem sorteados");
        int qtdDeNumeros = scanner.nextInt();
        System.out.println("Valor inicial");
        int valorMinimo = scanner.nextInt();
        System.out.println("Valor Máximo");
        int valorMaximo = scanner.nextInt();

        sorteador.sorteiaNumeros(qtdDeNumeros, valorMinimo, valorMaximo);
        System.out.println(sorteador.getNumeros());
        gerarNovamente();
    }

    public void gerarNovamente(){
        System.out.println("\n### Deseja gerar novamente? (S/N) ###");
        char sim = scanner.next().charAt(0);
        if (sim == 's' || sim == 'S'){
            inicio();
        }
    }
}