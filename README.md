# ProjetoRPG

Jogo de RPG com batalhas por turnos e interface gráfica em Java Swing. O jogador controla um herói, enfrenta inimigos sorteados e usa itens do inventário para recuperar vida ou aumentar o ataque.

Projeto final da disciplina de Programação Orientada a Objetos (2026.2) da Universidade Federal do Ceará (UFC), Campus Russas.

## Como jogar

- **Batalha** — escolha entre atacar, usar um item ou fugir. A tela exibe a vida dos personagens e o histórico do combate.
- **Inventário** — use poções para recuperar vida e equipe armas para aumentar o ataque. O inventário comporta até seis itens.
- **Progresso** — ao derrotar inimigos, o herói pode receber itens como recompensa. O jogo usa o arquivo local `save.txt` para salvar e carregar o progresso.

## Como executar no NetBeans

1. Instale o Apache NetBeans e um JDK compatível, como o JDK 17 ou 21. O Maven está configurado para compilar com alvo Java 17.
2. Clone o repositório.

   ```bash
   git clone https://github.com/jlucascode/ProjetoRPG.git
   ```

3. No NetBeans, abra **File → Open Project** e selecione a pasta `ProjetoRPG`, que contém o `pom.xml`.
4. Clique com o botão direito em **ProjetoRPG** e escolha **Run**. Se a IDE pedir a classe principal, selecione `com.mycompany.projetorpg.ProjetoRPG`. Ela abre o menu principal do jogo.

## Estrutura do código

As classes Java ficam em `src/main/java/com/mycompany/projetorpg`.

| Classes | Responsabilidade |
| --- | --- |
| `ProjetoRPG` | Ponto de entrada da aplicação. |
| `TelaMenuPrincipal`, `TelaBatalha` e `TelaInventario` | Telas Swing para navegação, combate e uso de itens. |
| `Personagem`, `Heroi` e `Inimigo` | Estado dos personagens e cálculo de dano. `Heroi` e `Inimigo` herdam de `Personagem` e implementam seu próprio cálculo. |
| `Batalha` | Processamento das ações por turno e registro do histórico do combate. |
| `Item`, `Pocao` e `Arma` | Uso polimórfico de itens para cura ou bônus de ataque. |
| `Inventario` e `InventarioCheioException` | Armazenamento dos itens em um `ArrayList` e controle do limite de capacidade. |
| `Arquivo` | Gravação e leitura do progresso em arquivo texto. |

## Integrantes

- João Lucas
- José Ernesto
