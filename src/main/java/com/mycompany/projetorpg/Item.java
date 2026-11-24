/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetorpg;

/**
 *
 * @author jluca
 */
public abstract class Item {

    protected String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    public abstract String usar(Heroi heroi);

    public abstract String paraArquivo();

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
