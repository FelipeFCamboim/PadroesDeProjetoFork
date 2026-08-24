import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dado implements IDado {
    private final int lados;
    private int valorJogada;
    private final Random random;

    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    public int getValor() {
        return valorJogada;
    }

    @Override
    private List<Integer> getHistorico() {
        return new ArrayList<>();
    }
}
