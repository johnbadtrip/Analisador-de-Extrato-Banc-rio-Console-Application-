package src;
import java.util.*;
import java.util.stream.*;

public class Relatorio {
    public static void gerar(List<Transacao> transacoes) {
        double saldo = transacoes.stream().mapToDouble(Transacao::getValor).sum();
        System.out.printf("Saldo final: R$ %.2f\n", saldo);

        System.out.println("\nDespesas por categoria:");
        Map<String, Double> categorias = new HashMap<>();
        for (Transacao t : transacoes) {
            String categoria = identificarCategoria(t.getDescricao());
            categorias.put(categoria, categorias.getOrDefault(categoria, 0.0) + t.getValor());
        }
        categorias.forEach((cat, val) -> {
            if (val < 0) System.out.printf("%s: R$ %.2f\n", cat, val);
        });

        System.out.println("\nTop 5 despesas:");
        transacoes.stream().filter(t -> t.getValor() < 0)
            .sorted(Comparator.comparingDouble(Transacao::getValor))
            .limit(5)
            .forEach(t -> System.out.printf("%s - %s: R$ %.2f\n", t.getData(), t.getDescricao(), t.getValor()));

        System.out.println("\nTop 5 receitas:");
        transacoes.stream().filter(t -> t.getValor() > 0)
            .sorted((a, b) -> Double.compare(b.getValor(), a.getValor()))
            .limit(5)
            .forEach(t -> System.out.printf("%s - %s: R$ %.2f\n", t.getData(), t.getDescricao(), t.getValor()));
    }

    private static String identificarCategoria(String descricao) {
        String desc = descricao.toLowerCase();
        if (desc.contains("ifood")) return "iFood";
        if (desc.contains("uber")) return "Uber";
        if (desc.contains("mercado")) return "Mercado";
        if (desc.contains("farmacia")) return "Farmácia";
        return "Outros";
    }
}