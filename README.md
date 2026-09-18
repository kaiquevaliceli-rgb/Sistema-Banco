Sistema Bancário (Java)

Projeto simples em Java, desenvolvido como prática de Programação Orientada a Objetos (POO), que simula as operações básicas de um sistema bancário.

Funcionalidades
Abertura de conta: Corrente ("CC") ou Poupança ("CP"), cada uma com saldo inicial diferente.
Depósito: adiciona valor ao saldo, desde que a conta esteja aberta.
Saque: retira valor do saldo, com verificação de saldo suficiente.
Consulta de estado: exibe conta, tipo, dono, saldo e status atual.
Pagamento de taxa mensal: desconta uma taxa fixa de acordo com o tipo de conta (R$ 12 para Corrente, R$ 20 para Poupança).
Fechamento de conta: bloqueia a conta caso não haja saldo pendente.
Tecnologias
Java (sem dependências externas)
Estrutura do projeto
src/
└── teste_pratico/
    ├── Banco.java       # Classe principal com atributos, regras de negócio e getters/setters
    └── mainbanco.java   # Classe de teste com o método main
Como executar
Clone o repositório:
   git clone https://github.com/kaiquevaliceli-rgb/Sistema-Banco.git
Abra o projeto no Eclipse (ou outra IDE Java de sua preferência).
Execute a classe mainbanco.java (botão direito > Run As > Java Application).
Próximas melhorias planejadas
Uso de enum para tipo de conta em vez de String.
Correção de comparação de Strings (.equals() em vez de ==).
Validações de valores negativos em depósitos e saques.
Persistência de dados em arquivo ou banco de dados.
Interface de usuário via console (menu interativo).
Autor

Kaique Valiceli
