package exercicio;

public class AppRobo {
    public static void main(String[] args) {
        /*
         * Robo robo = new Robo(3, 4)
         * 
         * System.out.println("A posição do robo é: " + robo.getX() + "" + robo.getY();
         * System.out.println( );
         * 
         * for (int i = 4; i < 6; i++) { robo.getX(); robo.getY();
         * System.out.println(robo.andarDireita); }
         */

        Robo robo = new Robo(3, 3);

        System.out.println(robo.posicaoAtual());
        robo.moverOeste();

        System.out.println(robo.posicaoAtual());
        robo.moverOeste();

        System.out.println(robo.posicaoAtual());
        robo.moverOeste();

        System.out.println(robo.posicaoAtual());
        robo.moverOeste();

        System.out.println(robo.posicaoAtual());
        robo.moverOeste();

        System.out.println(robo.posicaoAtual());
    }
}