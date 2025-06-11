# Analisador de Extrato Bancário

## Sobre o Projeto

Esta é uma aplicação de console desenvolvida em Java puro, sem frameworks. Ela lê um arquivo de extrato bancário em formato CSV, processa as transações e gera um relatório agregado no console, mostrando o saldo total, as despesas por categoria e as maiores transações do período.

O foco aqui foi aplicar os conceitos fundamentais de Java, como Programação Orientada a Objetos, manipulação de arquivos (IO), tratamento de exceções e uso avançado de `Collections` e `Streams`.


## Funcionalidades

* **Leitura de CSV:** O programa lê um arquivo `.csv` com colunas (Data, Descrição, Valor).
* **Processamento de Transações:** Cada linha do CSV é convertida em um objeto `Transacao`.
* **Relatório Agregado:**
    * Calcula o saldo final (soma de todas as transações).
    * Agrupa despesas por palavras-chave na descrição (ex: "iFood", "Uber", "Mercado").
    * Exibe as 5 maiores despesas e as 5 maiores receitas.

## Tecnologias Utilizadas

* **Java 17 (Core):** Utilização pura da linguagem, focando em:
    * **POO:** Classes como `Transacao`, `Analisador` e `Relatorio`.
    * **Java IO:** Para leitura do arquivo `.csv`.
    * **Java Collections Framework:** Uso intensivo de `List` para armazenar as transações.
    * **Java Streams API:** Para processar e agregar os dados de forma funcional e eficiente.
* **JUnit 5:** Para testes unitários das lógicas de cálculo e processamento.
