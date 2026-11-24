/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetorpg;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jluca
 */
public class Batalha {

    private Heroi heroi;
    private Inimigo inimigo;

    private ArrayList<String> historico = new ArrayList<>();
    private boolean terminada = false;
    private Random random = new Random();

    public Batalha(Heroi heroi, Inimigo inimigo) {
        this.heroi = heroi;
        this.inimigo = inimigo;
        historico.add("Um " + inimigo.getNome() + " apareceu!");
    }

    public void atacar() {
        int dano = heroi.atacar(inimigo);
        historico.add(heroi.getNome() + " atacou " + inimigo.getNome() + " e causou " + dano + " de dano.");

        if (!inimigo.estaVivo()) {
            vitoria();
        } else {
            turnoInimigo();
        }
    }

    public void usarItem(Item item) {
        historico.add(item.usar(heroi));
        turnoInimigo();
    }

    public void fugir() {
        if (random.nextInt(100) < 50) {
            historico.add(heroi.getNome() + " fugiu da batalha!");
            terminada = true;
        } else {
            historico.add(heroi.getNome() + " tentou fugir, mas não conseguiu!");
            turnoInimigo();
        }
    }

    private void turnoInimigo() {
        int dano = inimigo.atacar(heroi);
        historico.add(inimigo.getNome() + " atacou e causou " + dano + " de dano.");

        if (!heroi.estaVivo()) {
            historico.add(heroi.getNome() + " foi derrotado...");
            heroi.curar();
            terminada = true;
        }
    }

    private void vitoria() {
        historico.add(inimigo.getNome() + " foi derrotado!");
        Inimigo.contarDerrota();
        terminada = true;

        Item recompensa = inimigo.getRecompensa();
        try {
            heroi.getInventario().adicionar(recompensa);
            historico.add("Você recebeu: " + recompensa.getNome());
        } catch (InventarioCheioException e) {
            historico.add(e.getMessage());
        }
    }

    public String getUltimaMensagem() {
        return historico.get(historico.size() - 1);
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public Heroi getHeroi() {
        return heroi;
    }

    public Inimigo getInimigo() {
        return inimigo;
    }
}
