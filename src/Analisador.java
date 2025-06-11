package src;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class Analisador {
    public static List<Transacao> lerTransacoes(String caminhoCsv) throws IOException {
        List<Transacao> transacoes = new ArrayList<>();
        List<String> linhas = Files.readAllLines(Paths.get(caminhoCsv));
        for (int i = 1; i < linhas.size(); i++) { // pula o cabeçalho
            String[] partes = linhas.get(i).split(",");
            LocalDate data = LocalDate.parse(partes[0]);
            String descricao = partes[1];
            double valor = Double.parseDouble(partes[2].replace(",", "."));
            transacoes.add(new Transacao(data, descricao, valor));
        }
        return transacoes;
    }
}