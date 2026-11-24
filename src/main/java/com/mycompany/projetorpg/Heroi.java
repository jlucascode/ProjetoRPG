/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetorpg;

import java.util.Random;

/**
 *
 * @author jluca
 */
public class Heroi extends Personagem {

    private Inventario inventario;
    private Arma armaEquipada;
    private Random random = new Random();

    public Heroi(String nome) {
        this(nome, 100, 10, 3);
    }

    public Heroi(String nome, int vidaMaxima, int ataque, int defesa) {
        super(nome, vidaMaxima, ataque, defesa);
        inventario = new Inventario();
    }

    @Override
    public int calcularDano() {
        int dano = ataque + random.nextInt(4);
        if (armaEquipada != null) {
            dano += armaEquipada.getBonusAtaque();
        }
        return dano;
    }

    public void equipar(Arma arma) {
        this.armaEquipada = arma;
    }

    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    public Inventario getInventario() {
        return inventario;
    }

    @Override
    public String toString() {
        return "Herói: " + vida + "/" + vidaMaxima + "HP";
    }
}
