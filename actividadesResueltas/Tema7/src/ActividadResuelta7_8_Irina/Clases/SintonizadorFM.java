package ActividadResuelta7_8_Irina.Clases;

public class SintonizadorFM {
    double frecuencia;




    /**
     * metodo constructor
     * @param frecuencia
     */
    public SintonizadorFM(double frecuencia) {
        //validar que la frecuencie este comprendida entre 80 -> 108 con saltos de 0.5Mgh
        if (frecuencia < 80) {
            this.frecuencia = 80;

        } else if (frecuencia > 108) {
            this.frecuencia = 108;

        }else {
            this.frecuencia=frecuencia;
        }
    }


    public SintonizadorFM(){//si no se le encuentra frecuencia inicial,comenzamos en 80
        this.frecuencia=80;
    }
    //subir frecuencia(up)

    /**
     *
     * @return
     */
    public double up(){
        this.frecuencia+=0.5;
        //comprobamos que esa frecuencia esta dentro de los limites->metodo comprobador
        return this.frecuencia;
    }
//bajar de frecuencia

    /**
     *
     * @return
     */
    public double down(){
        this.frecuencia-=0.5;
        //comprobamos que esa frecuencia esta dentro de los limites->metodo comprobador
        return this.frecuencia;
    }



    public void comprobarFrecuencia(){
        //trabajamos directamente con el atributo de la clase->this.frecuencia
        if (this.frecuencia>80){
            this.frecuencia=108;
        }else if (this.frecuencia>108){
            this.frecuencia=80;
        }
    }
    //mostrar que frecuencia estas sintonizando
    public void display(){
        System.out.println("Sintonizando -> " +this.frecuencia+ "MHz");
    }



    //agregar una frecuencia favorita


    public double getFrecuencia() {
        return frecuencia;
    }

    /**
     *
     * @param frecuencia
     */
    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
        comprobarFrecuencia();
    }
}