public class Hijo extends Padre{
    private String hobbie;
    public Hijo(){
        super("Marco", 16,"14/02/2005");
        this.hobbie = "Tocar piano";
    }
    public double sacarRaiz(double a){
        double resultado = Math.sqrt(a);
        return resultado;
    }
}
