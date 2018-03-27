package br.com.jogodavelhamvc.controller;

import br.com.jogodavelha.model.Tabuleiro;

public class TabuleiroController {

    private Tabuleiro tabModel;

    private int numJogadas = 0;
    private int vitoriasP1 = 0;
    private int vitoriasP2 = 0;
    private int empates;
    private char sinal;

    public TabuleiroController() {
        this.tabModel = new Tabuleiro();
    }

    public boolean verificarTabuleiroVazio(int i, int j) {
        if (this.tabModel.getTabuleiroMatriz()[i][j] == '-') {
            return true;
        } else {
            return false;
        }
    }

    public void verificarJogador() {
        numJogadas++;
        if (numJogadas % 2 == 1) {
            this.setSinal('O');
        } else {
            this.setSinal('X');
        }

    }

    public String verificarJogo(char sinal, int linha, int coluna) {
        this.tabModel.preencherMatriz(sinal, linha, coluna);

        if (this.tabModel.verificarGanhador(sinal)) {
            this.tabModel.iniciarMatriz();

            if (getSinal() == 'X') {
                vitoriasP1++;
            } else {
                vitoriasP2++;
            }

            return "vitoria";

        } else if (numJogadas == 9) {
            this.tabModel.iniciarMatriz();
            empates++;
            return "empate";
        }
        return "";
    }

    public char getSinal() {
        return sinal;
    }

    public void setSinal(char sinal) {
        this.sinal = sinal;
    }

    public int getVitoriasP1() {
        return vitoriasP1;
    }

    public int getVitoriasP2() {
        return vitoriasP2;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNumJogadas(int numJogadas) {
        this.numJogadas = numJogadas;
    }

}
