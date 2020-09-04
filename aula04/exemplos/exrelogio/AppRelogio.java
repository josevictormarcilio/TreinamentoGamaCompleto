package exemplos.exrelogio;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(22, 45, 10);

        System.out.println(relogio.exibirHora());

        for (int i = 0; i < 10; i++) {
            relogio.avancarHora(22, 45);
            System.out.println(relogio.exibirHora());
        }
    }
}