public class Padre{
    private String nombre;
    protected int edad; 
    protected String fechaNacimiento; 
    public Padre(String nombre, int edad, String fechaNacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    protected String llamarLaAtencionHija(Hija a){
        String saludo = "¿Que tanto paras frente a la compu?, floja. Anda a hacer algo productivo. *Se muere de envidia";
        return saludo;
    }
    protected String reñirHijo(Hijo h){
        String frase = "Te dije que sacaras buenas notas, ahora te quito la play; jaja diria eso pero no tenemos asi que dormiras afuera >:)";
        return frase;
    }
    protected String sumar5numeros(int a, int b, int c, int d, int e){
        int resultado = a + b + c + d + e;
        String aux = "Jajaja mira we que facilito, el resultado es " + resultado;
        return aux;
    }
}
