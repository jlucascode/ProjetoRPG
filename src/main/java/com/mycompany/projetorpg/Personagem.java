/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetorpg;

/**
 *
 * @author jluca
 */
public abstract class Personagem {

    protected String nome;
    protected int vidaMaxima;
    protected int vida;
    protected int ataque;
    protected int defesa;

    public Personagem(String nome, int vidaMaxima, int ataque, int defesa) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public abstract int calcularDano();

    public int atacar(Personagem alvo) {
        int dano = calcularDano() - alvo.getDefesa();
        if (dano < 1) {
            dano = 1;
        }
        alvo.receberDano(dano);
        return dano;
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void curar() {
        vida = vidaMaxima;
    }

    public void curar(int quantidade) {
        vida += quantidade;
        if (vida > vidaMaxima) {
            vida = vidaMaxima;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public String toString() {
        return nome + ": " + vida + "/" + vidaMaxima + "HP";
    }
}
