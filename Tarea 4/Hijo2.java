public class Hijo2 extends Padre{
    private String comidaFavorita;
    public Hijo2(){
        super("Juan", 14,"19/05/2007");
        comidaFavorita = "Silpancho";
    }
    public String decirComidaFavorita(){
        String frase = "Hola chiquita, si quieres casarte conmigo, almenos debes saber hacer " + comidaFavorita;
        return frase;
    } 
}
