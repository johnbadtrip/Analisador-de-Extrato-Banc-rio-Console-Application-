package src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Transacao> transacoes = Analisador.lerTransacoes("extrato.csv");
            Relatorio.gerar(transacoes);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}