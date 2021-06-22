public class Hija extends Padre{
    private String vicio;
    public Hija(){
        super("Nicole", 18,"15/06/2003");
        vicio = "Videogames";
    }
    public String calcularTiempoDeMuerte(double dañoArma, double vidaObjetivo){
        double calculo = Math.round(vidaObjetivo / dañoArma);
        String report = "Tengo una espada de " + dañoArma + " de daño, y mi objetivo tiene una vida total de " + vidaObjetivo + " entonces tengo que darle " + calculo + " chingadasos en la cara >:>";
        return report;
    }
}
