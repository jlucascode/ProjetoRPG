/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetorpg;

/**
 *
 * @author jluca
 */
public class Pocao extends Item {

    private int cura;

    public Pocao(String nome, int cura) {
        super(nome);
        this.cura = cura;
    }

    @Override
    public String usar(Heroi heroi) {
        heroi.curar(cura);
        heroi.getInventario().remover(this);
        return heroi.getNome() + " usou " + nome + " e recuperou " + cura + " de vida.";
    }

    @Override
    public String paraArquivo() {
        return "pocao;" + nome + ";" + cura;
    }

    public int getCura() {
        return cura;
    }

    @Override
    public String toString() {
        return nome + " (+" + cura + " HP)";
    }
}
