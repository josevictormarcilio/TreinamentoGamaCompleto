package exercicio;

/**
 * Robo
 */
public class Robo {
    /*
     * int posicaox, posicaoy, andarDireita, andarEsquerda, andarCima, andarBaixo;
     * 
     * //construtor Robo(int posicaox, int posicaoy){ this.posicaox = posicaox;
     * this.posicaoy = posicaoy; }
     * 
     * //get public int getX(){ return posicaox; }
     * 
     * public int getY(){ return posicaoy; }
     * 
     * //set public void posicaox(int posicaox){ this.posicaox = posicaox; }
     * 
     * public void posicaoy(int posicaoy){ this.posicaoy = posicaoy; }
     * 
     * //andar public void andarDireita(){ andarDireita++; }
     * 
     * public void andarEsquerda(){ andarEsquerda++; }
     * 
     * public void andarCima(){ andarDireita++; }
     * 
     * public void andarBaixo(){ andarDireita++;
     */

    private int x, y;
    private final int MAX_X;
    private final int MAX_Y;

    public Robo(int maxX, int maxY) {
        if (maxX > 0 && maxY > 0) {
            MAX_X = maxX;
            MAX_Y = maxY;
        } else {
            MAX_X = 10;
            MAX_Y = 10;
        }
    }

    public void moverNorte() {
        if (y < MAX_Y) {
            y++;
        }
    }

    public void moverSul() {
        if (y > -MAX_Y) {
            y--;
        }
    }

    public void moverLeste() {
        if (x < MAX_X) {
            x++;
        }
    }

    public void moverOeste() {
        if (x > -MAX_Y) {
            x--;
        }
    }

    public String posicaoAtual() {
        return x + ":" + y;
    }
}
