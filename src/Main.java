//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciación del objeto llamado "bmw"
        Automovil bmw = new Automovil();
        //Asignación de valores a los atributos
        bmw.marca = "BMW";
        bmw.color = "Azul";
        bmw.modelo = "i320";
        bmw.cilindraje = 2.8;
        //Llamamos al metodo para imprimir
        bmw.detalleauto();



        //Instanciación del objeto llamado "mb"
        Automovil mb = new Automovil();
        //Asignación de valores a los atributos
        mb.marca = "Mercedes Benz";
        mb.color = "Rojo";
        mb.modelo = "Sonet";
        mb.cilindraje = 3.0;
        //Llamamos al metodo para imprimir
        mb.detalleauto();

    }
}