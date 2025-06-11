import org.junit.jupiter.api.Test;
import src.Analisador;
import src.Transacao;
import java.util.*;
import java.nio.file.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class AnalisadorTest {
    @Test
    public void testLerTransacoes() throws IOException {
        String csv = "Data,Descrição,Valor\n2024-06-01,Salário,1000.00\n2024-06-02,Uber,-50.00";
        Path tempFile = Files.createTempFile("extrato-test", ".csv");
        Files.write(tempFile, csv.getBytes());
        List<Transacao> transacoes = Analisador.lerTransacoes(tempFile.toString());
        assertEquals(2, transacoes.size());
        assertEquals("Salário", transacoes.get(0).getDescricao());
        assertEquals(1000.00, transacoes.get(0).getValor(), 0.01);
        assertEquals(-50.00, transacoes.get(1).getValor(), 0.01);
        Files.delete(tempFile);
    }
}