import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador {
    List<Integer> numerosSorteados = new ArrayList<>();
    Random random = new Random();

    // Adiciona e Faz leitura do número
    public void adicionarNumero(int numero) {
        numerosSorteados.add(numero);
    }

    public List<Integer> getNumeros() {
        return numerosSorteados;
    }

    // Sorteia o numero entre o minimo e o maximo e adiciona na lista
    protected void sorteiaNumeros(int qtdNumerosParaSortear, int valorMin, int valorMax){
        // Verificação de segurança: evitar loop infinito
        if (qtdNumerosParaSortear > (valorMax - valorMin + 1)) {
            throw new IllegalArgumentException("Quantidade maior do que o intervalo disponível!");
        }
        if (qtdNumerosParaSortear < 1) {
            throw new IllegalArgumentException("A quantidade de números a sortear deve ser pelo menos 1.");
        }
        if (valorMin > valorMax) {
            throw new IllegalArgumentException("O valor mínimo não deve ser maior que o valor máximo");
        }

        if (!numerosSorteados.isEmpty()){
            numerosSorteados.clear();
        }

        while (numerosSorteados.size() < qtdNumerosParaSortear){
            int numeroSorteado = random.nextInt((valorMax - valorMin) + 1) + valorMin;
            if (!numerosSorteados.contains(numeroSorteado)){
                adicionarNumero(numeroSorteado);
            }
        }
    }
}