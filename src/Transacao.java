package src;
import java.time.LocalDate;

public class Transacao {
    private LocalDate data;
    private String descricao;
    private double valor;

    public Transacao(LocalDate data, String descricao, double valor) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public LocalDate getData() { return data; }
    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }
}