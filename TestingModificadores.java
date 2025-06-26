import paquete.Clase1;

public class TestingModificadores {
    public static void main(String[] args) {
        ClasePadre unPapa = new ClasePadre();
        ClaseHijo unHijo = new ClaseHijo();
        Clase1 objeto1 = new Clase1();


        System.out.println(unPapa.toString());
        System.out.println(unPapa.toString());

        // modificar el campo publico
        unPapa.campo1 = -28; // Modificar el campo publico
        unPapa.setCampo2(-12); // Modificar el campo privado

        System.out.println(unPapa.toString());

        // Comportamiento de campo privado y publico en el hijo
        unHijo.campo1 = 32; // campo publico heredado
        unHijo.setCampo2(-45); // campo privado heredado
        unHijo.setCampo3(12); // campo privado propio

        System.out.println(unHijo.toString());

        // Comportamiento de campos de una clase en un paquete
        objeto1.x = 56; // camo publico
        objeto1.setY(42); // Campo privado
        
        //objeto1.z = 98; 
        // No se puede acceder porque no esta en el mismo paquete
        // Y es tipo protected
        System.out.println(objeto1.toString());

    }

}
