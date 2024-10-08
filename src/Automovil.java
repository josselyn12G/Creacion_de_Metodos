public class Automovil {

    //Declaración de atributos.
    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje;

    //Creación de metodo para imprimir por consola. No recibe parámetros ni devuelve.
    public void detalleauto(){

        //Variable de clase tipo SRTING
        String modelo = "otro"; //La variable es de color gris.

        /*
        Palabra "this":
        1. Hace referencia a las características asignadas a los atributos de la clase.
        2. Si no utilizo esta palabra y se asigna una variable dentro del metodo con otra característica,
        va a utilizar esa característica... en este caso es "otro".
        */

        System.out.println("Marca del auto = " + this.marca);
        System.out.println("Modelo del auto = " + this.modelo);
        System.out.println("Color del auto = " + this.color);
        System.out.println("Cilindraje del auto= " + this.cilindraje);
    }
}