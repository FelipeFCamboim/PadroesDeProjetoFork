import java.util.ArrayList;
import java.util.List;

public class DadoComHistorico implements IDado {
    private final IDado dado;
    private final List<Integer> historico;

    public DadoComHistorico(IDado dado) {
        this.dado = dado;
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        dado.rolar();
        historico.add(dado.getValor());
    }

    @Override
    public int getValor() {
        return dado.getValor();
    }

    @Override
    public List<Integer> getHistorico() {
        return new ArrayList<>(historico);
    }
}