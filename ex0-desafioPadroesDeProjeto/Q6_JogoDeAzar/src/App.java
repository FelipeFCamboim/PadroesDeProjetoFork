public class App {
    public static void main(String[] args) {
        DadoComHistorico d6 = new DadoComHistorico(new Dado(6));
        d6.rolar();
        d6.rolar();
        d6.rolar();
        d6.rolar();
        d6.rolar();
        d6.rolar();

        System.out.println("Valor atual: " + d6.getValor());
        System.out.println("Historico: " + d6.getHistorico());
    }
}
