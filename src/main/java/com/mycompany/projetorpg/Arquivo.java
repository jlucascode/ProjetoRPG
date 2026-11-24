/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetorpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jluca
 */
public class Arquivo {

    private static final String CAMINHO = "save.txt";

    public static boolean existeSave() {
        return new File(CAMINHO).exists();
    }

    public static void salvar(Heroi heroi) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO));

        String arma = "-";
        if (heroi.getArmaEquipada() != null) {
            arma = heroi.getArmaEquipada().getNome();
        }

        bw.write("heroi;" + heroi.getNome() + ";" + heroi.getVidaMaxima() + ";" + heroi.getVida() + ";"
                + heroi.getAtaque() + ";" + heroi.getDefesa() + ";" + Inimigo.getDerrotados() + ";" + arma);
        bw.newLine();

        for (Item item : heroi.getInventario().getItens()) {
            bw.write(item.paraArquivo());
            bw.newLine();
        }
        bw.close();
    }

    public static Heroi carregar() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(CAMINHO));

        String[] dados = br.readLine().split(";");
        Heroi heroi = new Heroi(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[4]), Integer.parseInt(dados[5]));
        heroi.setVida(Integer.parseInt(dados[3]));
        Inimigo.setDerrotados(Integer.parseInt(dados[6]));
        String armaEquipada = dados[7];

        String linha;
        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(";");
            Item item;
            if (partes[0].equals("pocao")) {
                item = new Pocao(partes[1], Integer.parseInt(partes[2]));
            } else {
                item = new Arma(partes[1], Integer.parseInt(partes[2]));
                if (partes[1].equals(armaEquipada)) {
                    heroi.equipar((Arma) item);
                }
            }

            try {
                heroi.getInventario().adicionar(item);
            } catch (InventarioCheioException e) {
                System.out.println(e.getMessage());
            }
        }
        br.close();
        return heroi;
    }
}
