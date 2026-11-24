/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetorpg;

import java.util.ArrayList;

/**
 *
 * @author jluca
 */
public class Inventario {

    public static final int CAPACIDADE_MAXIMA = 6;

    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionar(Item item) throws InventarioCheioException {
        if (itens.size() >= CAPACIDADE_MAXIMA) {
            throw new InventarioCheioException("Inventário cheio! " + item.getNome() + " foi perdido.");
        }
        itens.add(item);
    }

    public void remover(Item item) {
        itens.remove(item);
    }

    public Item getItem(int indice) {
        return itens.get(indice);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public int getQuantidade() {
        return itens.size();
    }

    public boolean estaVazio() {
        return itens.isEmpty();
    }
}
