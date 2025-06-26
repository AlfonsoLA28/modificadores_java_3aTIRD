public class ClaseHijo extends ClasePadre{
    private int campo3;

    public int getCampo3() {
        return campo3;
    }

    public void setCampo3(int campo3) {
        this.campo3 = campo3;
    }
    
    //Modificar los campos de la Clase Padre
    public void setDataPadre(){
        this.campo1 = -56; // Variable publica heredada
        // variable privada heredada 
        this.setCampo2(23); //super.setCampo2(23); 
    }

    @Override
    public String toString() {
        return super.toString() + "ClaseHijo [campo3=" + this.campo3 + "]";


    }


    
}
