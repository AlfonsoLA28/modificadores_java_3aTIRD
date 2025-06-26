public class ClasePadre {
    // Miembros de la la clase (propiedades, atributos y campos)
    public int campo1; // Aceptar solo valores positivos
    private int campo2; // Aceptar solo valores negativos


    public void setCampo2(int campo2){
        if (campo2 < 0)
        this.campo2 = campo2;
        else
        this.campo2 = 0;
    }
    

    @Override
    public String toString() {
        return "ClasePadre [campo1=" + this.campo1 + ", campo2=" + this.campo2 + "]";
    }

    public int getCampo2() {
        return campo2;
    }



    
}