ProjetoRPG - Sistema de Batalha e Exploração em Java Swing

📖 Sobre o Projeto

O ProjetoRPG é um jogo de interpretação de papéis (RPG) baseado em turnos desenvolvido em Java, utilizando o paradigma de Orientação a Objetos (POO) e uma interface gráfica moderna construída com Java Swing.

O sistema foi concebido como o Projeto Final da disciplina de Programação Orientada a Objetos (2026.2), aplicando conceitos fundamentais de modelagem de software, encapsulamento, herança, polimorfismo e modularização gráfica através de telas interativas no ambiente Apache NetBeans.

🎯 Objetivos Acadêmicos

Este projeto tem como finalidade prática consolidar os pilares da POO estudados em sala de aula:

Abstração e Modelagem: Mapeamento de entidades do mundo real e do universo de jogos em classes coesas.

Encapsulamento: Proteção do estado interno dos objetos através de modificadores de acesso e métodos de acesso controlados.

Reuso de Código: Aplicação de herança entre classes de personagens e itens.

Separação de Interesses: Organização modular entre as classes de modelo (dados), classes de controle e a interface gráfica baseada em componentes Swing (JFrame e JPanel).

🏛️ Arquitetura e Estrutura do Projeto

O código-fonte está estruturado de forma modular para garantir a legibilidade e a manutenibilidade:

ProjetoRPG/
│
├── src/main/java/com/mycompany/projetorpg/
│   ├── JogoMain.java             # Classe principal de inicialização
│   ├── TelaMenuPrincipal.java    # Interface gráfica do menu inicial
│   ├── TelaBatalha.java          # Interface gráfica de combate por turnos
│   ├── TelaInventario.java       # Interface gráfica de gerenciamento de itens
│   ├── Heroi.java                # Modelo de dados do personagem do jogador
│   ├── Inimigo.java              # Modelo de dados dos oponentes
│   └── Item.java                 # Modelo de dados para poções e equipamentos
│
└── README.md


Principais Componentes:

TelaMenuPrincipal: Ponto de entrada visual onde o jogador interage com as opções iniciais de navegação.

TelaBatalha: Gerencia a interface visual do combate, exibindo barras de vida dinâmicas e o painel de log de ações (Atacar, Usar Item, Fugir).

TelaInventario: Exibe os itens disponíveis ao jogador através de componentes de lista customizados.

Classes de Modelo (Heroi, Inimigo, Item): Contêm os atributos encapsulados e os métodos operacionais específicos de cada entidade do jogo.

🛠️ Tecnologias e Ferramentas Utilizadas

Linguagem: Java (JDK 17+)

Ambiente de Desenvolvimento (IDE): Apache NetBeans 25+

Biblioteca Gráfica: Java Swing / AWT (Componentes JFrame, JPanel, JButton, JLabel, JList, JTextArea)

Controle de Versão: Git & GitHub

🚀 Como Executar o Projeto

Para executar o projeto localmente em sua máquina, siga os passos abaixo:

Pré-requisitos: Certifique-se de ter o JDK (Java Development Kit) e o Apache NetBeans instalados.

Clonar o Repositório:

git clone https://github.com/jlucascode/ProjetoRPG.git


Abrir no NetBeans:

Abra o Apache NetBeans.

Vá em File > Open Project e selecione a pasta do repositório ProjetoRPG.

Executar:

No painel esquerdo do NetBeans, expanda o projeto.

Clique com o botão direito na classe principal ou na TelaMenuPrincipal e selecione Run File (ou pressione Shift + F6).

👥 Autoria e Créditos

Desenvolvido com dedicação para a disciplina de Programação Orientada a Objetos:

Desenvolvedor Principal: João Lucas Miranda

Instituição: Universidade Federal do Ceará (UFC) - Campus Russas
