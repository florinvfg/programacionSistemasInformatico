package ActividadResuelta7_5Irina.Clase;


    public class CuentaCorriente {
        public String nombreCliente;
        String dni;
        private double saldo;
        static String nombreBanco="Banco PSI";
Gestor elGestorCta;


        /**
         *
         * @param nombreCliente
         * @param dni
         * @param gestor
         */
        public CuentaCorriente(String nombreCliente,String dni, Gestor gestor){
            this.nombreCliente=nombreCliente;
            this.dni=dni;
            this.saldo=0;
            this.elGestorCta=gestor;
        }

        /**
         *
         * @param importe
         * @return operacionPosible
         */
        public boolean egreso(double importe){
            boolean operacionPosible;
            if (this.saldo>=importe){
                this.saldo-=importe;
                operacionPosible=true;
            }else {
                System.err.println("operacion no es posible...no tiene saldo");
                operacionPosible=false;
            }
            return operacionPosible;
        }

        /**
         * metodo para ingresar dinero a la cuenta corriente y sumarlo a saldo
         * @param ingreso
         */
        public void ingresar(double ingreso){
            this.saldo+=ingreso;
        }
        /**
         * CONSTRUCTOR VACIO
         * */
        public CuentaCorriente() {
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }


        public static String getNombreBanco() {
            return nombreBanco;
        }

        public static void setNombreBanco(String nombreBanco) {
            ActividadResuelta7_4Irina.Clases.CuentaCorriente.setNombreBanco(nombreBanco);
        }

        /**
         *
         * @param nombreCliente
         * @param dni
         * @param saldo
         */
        public CuentaCorriente(String nombreCliente, String dni, double saldo, Gestor gestor) {
            this.nombreCliente = nombreCliente;
            this.dni = dni;
            this.saldo = saldo;
            this.elGestorCta=gestor;
        }



        public void mostrarInfo(){
            //tenemos que validar que exista un gestor para mostrar la informacion
            //de la clase gestor
            if (elGestorCta==null){
                System.out.println("Cuenta sin gestor asignado");
            }else {
                System.out.println(elGestorCta.toString());
            }
            System.out.println("nombre de cliente-> " + this.nombreCliente+
                    "\nDNI->" +this.dni+
                    "\nSaldo actual-> " + this.saldo+
                    "\nBanco -> " +nombreBanco);
        }

        public Gestor getElGestorCta() {
            return elGestorCta;
        }

        public void setElGestorCta(Gestor elGestorCta) {
            this.elGestorCta = elGestorCta;
        }

        @Override
        public String toString() {
            return "CuentaCorriente{" +
                    "nombreCliente='" + nombreCliente + '\'' +
                    ", dni='" + dni + '\'' +
                    ", saldo=" + saldo +
                    '}';
        }
    }


