/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetorpg;

/**
 *
 * @author jluca
 */
public class Arma extends Item {

    private int bonusAtaque;

    public Arma(String nome, int bonusAtaque) {
        super(nome);
        this.bonusAtaque = bonusAtaque;
    }

    @Override
    public String usar(Heroi heroi) {
        heroi.equipar(this);
        return heroi.getNome() + " equipou " + nome + ".";
    }

    @Override
    public String paraArquivo() {
        return "arma;" + nome + ";" + bonusAtaque;
    }

    public int getBonusAtaque() {
        return bonusAtaque;
    }

    @Override
    public String toString() {
        return nome + " (+" + bonusAtaque + " ATQ)";
    }
}
