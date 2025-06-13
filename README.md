Analisador de Extrato Bancário
📄 Sobre o Projeto

Este projeto é uma aplicação de console desenvolvida em Java puro que lê um arquivo de extrato bancário (em formato .csv) e realiza uma análise, calculando o total de depósitos, retiradas e o balanço final.

O objetivo principal foi praticar e demonstrar conhecimentos sólidos em Java Core, incluindo manipulação de arquivos (IO), tratamento de exceções, uso de coleções (Lists) e programação orientada a objetos.
🛠️ Tecnologias Utilizadas

    Java 17
    JUnit 5 (Opcional, se você adicionar testes): Para garantir a qualidade e o funcionamento correto das lógicas de negócio.

✨ Funcionalidades

    Leitura de transações a partir de um arquivo extrato.csv.
    Cálculo do valor total de todas as transações.
    Cálculo do total de depósitos (transações positivas).
    Cálculo do total de retiradas (transações negativas).
    Exibição de um relatório final no console.

⚙️ Como Executar

    Clone o repositório:
    git clone https://github.com/johnbadtrip/AnalisadorExtratoBancario.git

    Navegue até o diretório do projeto:
    cd AnalisadorExtratoBancario

    Compile os arquivos Java:
    javac -d ./bin ./src/*.java

    Execute a aplicação:
    java -cp ./bin NomeDaClassePrincipal
    Obs: Substitua NomeDaClassePrincipal pelo nome da classe que contém o método main.

🎓 O que aprendi

    Manipulação de arquivos em Java utilizando a API de IO.
    Parseamento de dados de arquivos CSV.
    Utilização eficiente de coleções para armazenar e processar dados.
    Design de classes e objetos para modelar um problema real de forma coesa.
    Prática de tratamento de exceções para tornar a aplicação mais robusta.
