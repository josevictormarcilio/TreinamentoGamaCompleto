package exemplos.exrelogio;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public String exibirHora(){
        return hora + ":" + minuto + ":" + segundo;
        
    }

    public void avancarHora(int hora, int minuto) {
        // hora != 23 && minuto > 59 && segundo > 59 - muda hora, minuto e segundo, exemplo: 22:00:00
        // hora == 23 && minuto > 59 && segundo > 59 - muda hora e minuto, exemplo: 00:00:00
        // minuto != 59 && segundo > 59 - muda segundo e minuto, exemplo: 22:01:00
        
        if (hora != 23 && minuto <= 59 && segundo <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo + 1;
        }

    }
}
