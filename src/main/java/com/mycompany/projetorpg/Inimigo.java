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
public class Inimigo extends Personagem {

    private static int derrotados = 0;

    private Item recompensa;
    private Random random = new Random();

    public Inimigo(String nome, int vidaMaxima, int ataque, int defesa, Item recompensa) {
        super(nome, vidaMaxima, ataque, defesa);
        this.recompensa = recompensa;
    }

    @Override
    public int calcularDano() {
        return ataque + random.nextInt(3);
    }

    public Item getRecompensa() {
        return recompensa;
    }

    public static int getDerrotados() {
        return derrotados;
    }

    public static void setDerrotados(int derrotados) {
        Inimigo.derrotados = derrotados;
    }

    public static void contarDerrota() {
        derrotados++;
    }

    public static Inimigo sortear() {
        ArrayList<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(new Inimigo("Goblin", 40, 8, 1, new Pocao("Poção Pequena", 20)));
        inimigos.add(new Inimigo("Lobo", 45, 9, 1, new Pocao("Poção Pequena", 20)));
        inimigos.add(new Inimigo("Esqueleto", 50, 10, 2, new Arma("Espada Velha", 3)));
        inimigos.add(new Inimigo("Orc", 60, 11, 3, new Pocao("Poção Grande", 50)));
        inimigos.add(new Inimigo("Cavaleiro Negro", 70, 12, 4, new Arma("Machado de Guerra", 6)));

        Random r = new Random();
        return inimigos.get(r.nextInt(inimigos.size()));
    }
}
