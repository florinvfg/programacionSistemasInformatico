package ExplicacionesIrina_CrudSocios.Controller;


import ExplicacionesIrina_CrudSocios.Modelo.Socio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {

        static Scanner sn=new Scanner(System.in);
        //Voy a crear socios en alta, y lo agrego a esta lista...
        static ArrayList<Socio> lista=new ArrayList<>();

        public static void main(String[] args) {
            /***
             * Crear un menu, insertar los datos, despues guardarlos....ArrayList->Colección
             *          C R U D        CREAR - LEER - ACTUALIZAR -BORRAR
             *          R E P E
             *          E A D L
             *          A D A E
             *          T   T T
             *          E   E E
             *
             */
            menu();
        }

        public static void menu(){
            int opcion=0;

            do {
                mostrar("C R U D   DE   SOCIOS");
                mostrar("*************************");
                mostrar("1. Alta de Socio");
                mostrar("2. Listar Socios");
                mostrar("3. Actualizar Socio por Id");
                mostrar("4. Eliminar Socio por Id");
                mostrar("5. Salir");
                try {
                    mostrarSln("Indique su opción-> ");
                    opcion=sn.nextInt();

                }catch(InputMismatchException e){
                    mostrar("Solo se aceptan opciones de 1 al 5");
                    sn.next();
                }


                switch (opcion){
                    case 1-> {
                        int idT=idExiste(leerID());
                        lista.add(alta(idT));

                    }
                    case 2->{
                        listar();

                    }
                    case 3-> {
                        //para buscar un elemento y nos diga su posicion,utilizar si es de
                        //tipo String indexof
                        int idA = leerID();
                        actualizarEliminar(idA,3);
                    }
                        case 4->{
                            int id=leerID();
                            actualizarEliminar(id,4);

                        }
                        case 5->{
                        mostrar("Adios");
                        }

                    }



            }while (opcion!=5);

        }
        public static void mostrar(String texto ) {
            System.out.println("\t" + texto);
        }
        public static void mostrarSln(String texto ) {
            System.out.print("\t" + texto);
        }

    /**
     *
     * @return
     */
        public static int leerID(){
            int idLeido=-1;
            do {
                try {
                    mostrarSln("Indique el Id del Socio->");
                    idLeido=sn.nextInt();
                }catch (InputMismatchException e){
                    mostrar("Formato incorrecto,solo numeros");
                    sn.next();
                }
            }while (idLeido ==-1);

            return idLeido;
        }
        public static int idExiste(int idT){
            while (buscarPosicion(idT)>=0){
    mostrarSln("Numero de Id existente");
    idT=leerID();
            }
            return idT;
        }
        public static void actualizarEliminar(int idAE,int opcion) {
            int posicion = buscarPosicion(idAE);//si posicion es ´1 no existe ese id
            String accion = opcion == 3 ? "Actualizacion" : "Eliminacion";
            if (opcion >= 0 && opcion == 3) {//solo se pide datos si ese id existe
                //solicitamos los datos y creamos un nuevo objeto para insertarlo
                Socio socioActualizar = alta(idAE);
                mostrar("Datos Actuales -> "+lista.get(posicion));
                mostrar("Datos a actualizar-> "+socioActualizar);
                if (confirmacion()){
                    lista.set(posicion,socioActualizar);
                    mesajeExito(accion);
                }else {
                    mesajeNoRealizado(accion);
                }
            }
            if (posicion>=0 && opcion==4){
                if (confirmacion()){
                    lista.remove(posicion);
                    mesajeExito(accion);
                }else {
                    mesajeNoRealizado(accion);
                }
            }
            if (opcion<0 && opcion==3 || posicion<0 && opcion==4){
                mostrar("** EL ID indicado no corresponde a ningun Socio **");
            }
        }

    /**
     *
     * @param id
     * @return
     */
        public static int buscarPosicion(int id){
            int posicion=-1;
            for (Socio e:lista){
                if (e.getId()==id){
                    posicion=lista.indexOf(e);//index.of nos devuelve elemento buscado
                    break;

                }
            }
            return posicion;
        }

    /**
     *
     * @return
     */
    public static boolean confirmacion(){
            boolean confirmado=false;
            mostrarSln("Estas seguro de hacer los cambios [S] o [N] ->");
            String confirmar=new Scanner(System.in).nextLine();
            if (confirmar.equalsIgnoreCase("S")){
                confirmado=true;
            }
            return confirmado;
}
public static void mesajeExito(String accion){
            mostrarSln("**********************");
            mostrar("**" + accion + "  realizada correctamente    ***");
            mostrar("**************************");
}
public static void mesajeNoRealizado(String accion){
            mostrarSln("***********************");
            mostrar("** No se ha realizado ninguna " + accion + " ***");
            mostrar("*************************");
}
    /**
     *
     * @return new Socio
     */
        public static  Socio alta(int idT){

         boolean fechaCorrecta=false;
         String fnT=null;
         mostrarSln("Nombre del Socio :");
        String nomT=new Scanner(System.in).nextLine();
         while (!contieneSoloLetras(nomT)){
             mostrarSln("Nombre debe tener solo letras :");
             nomT=new Scanner(System.in).nextLine();
         }
         do {

             try {
                 mostrarSln("Fecha de nacimiento (DD/MM/AAAA):");
                 fnT = new Scanner(System.in).nextLine();
                 DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                 LocalDate fechaNacimiento = LocalDate.parse(fnT, f);
                 fechaCorrecta = true;
             } catch (DateTimeParseException e) {
                 mostrar("Formato incorrecto, indique una fecha valida");
             }
         }while (!fechaCorrecta);
             return new Socio(idT,nomT,fnT);


        }
        public static void listar(){
            for (Socio e:lista){
                mostrar(e.toString()+"\n");
            }

            }

    /**
     * Metodo que evalua mediante una expresion regular el nombre, solo letrasy espacios acceptados en el String
     * @param texto nombre leido por Scanner
     *
     * @return verdadero o falso segun la evaluacion de la expresion regular
     */
    public static boolean contieneSoloLetras(String texto){
            //exprecion regular que verifica si el texto contiene solo letras (mayusculas o minusculas
        return texto.matches("[a-zA-Z\\s]+");
        }
    }

