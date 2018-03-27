package br.com.jogodavelha.model;

public class Tabuleiro {

    private char tabuleiroMatriz[][] = new char[3][3];

    public Tabuleiro() {
        iniciarMatriz();
    }

    public char[][] getTabuleiroMatriz() {
        return tabuleiroMatriz;
    }

    public void setTabuleiroMatriz(char[][] tabuleiroMatriz) {
        this.tabuleiroMatriz = tabuleiroMatriz;
    }

    public void iniciarMatriz() {
        for (int i = 0; i < tabuleiroMatriz.length; i++) {
            for (int j = 0; j < tabuleiroMatriz.length; j++) {
                tabuleiroMatriz[i][j] = '-';
            }
        }
    }

    public void preencherMatriz(char sinal, int linha, int coluna) {
        tabuleiroMatriz[linha][coluna] = sinal;
    }

    public boolean verificarGanhador(char sinal) {

        if ((tabuleiroMatriz[0][0] == sinal && tabuleiroMatriz[0][1] == sinal && tabuleiroMatriz[0][2] == sinal) || //linha 1
                (tabuleiroMatriz[1][0] == sinal && tabuleiroMatriz[1][1] == sinal && tabuleiroMatriz[1][2] == sinal) || //linha 2
                (tabuleiroMatriz[2][0] == sinal && tabuleiroMatriz[2][1] == sinal && tabuleiroMatriz[2][2] == sinal) || //linha 3
                (tabuleiroMatriz[0][0] == sinal && tabuleiroMatriz[1][0] == sinal && tabuleiroMatriz[2][0] == sinal) || //coluna 1
                (tabuleiroMatriz[0][1] == sinal && tabuleiroMatriz[1][1] == sinal && tabuleiroMatriz[2][1] == sinal) || //coluna 2
                (tabuleiroMatriz[0][2] == sinal && tabuleiroMatriz[1][2] == sinal && tabuleiroMatriz[2][2] == sinal) || //coluna 3
                (tabuleiroMatriz[0][0] == sinal && tabuleiroMatriz[1][1] == sinal && tabuleiroMatriz[2][2] == sinal) || //diagonal
                (tabuleiroMatriz[0][2] == sinal && tabuleiroMatriz[1][1] == sinal && tabuleiroMatriz[2][0] == sinal)) {  //diagonal inversa
            return true;
        }

        return false;
    }

}
