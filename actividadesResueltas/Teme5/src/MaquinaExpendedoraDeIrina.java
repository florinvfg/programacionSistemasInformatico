
/**
 * @Descripcion
 * @Autor
 * @Vercion 1.0 14/03/2024
 *
 * **/

import java.util.*;
public class MaquinaExpendedoraDeIrina {
    public static void main(String[] args) {
        menu();

    }

    /**
     * Muestra el menu de la aplicacion
     */
    public static void menu() {
        //Array de la golocinas
        String[][] golosinas = {

                {
                        "KitKat", "Chicles de Fresa", "Lacasitos", "Palotes"
                },
                {
                        "Kinder Bueno", "Bolsa Haribo", "Chettos", "Twix"
                },
                {
                        "Galletas OREO", "M&M s", "Patatas Fritas", "Chicles de Menta"
                },
                {"Milkybar", "KitKat Blanco", "Galleta Oreo Fresa", "Huesitos"
                }
        };


//Array de precios
        double[][] precios = {
                {1.5, 1.10, 1.65, 1.10
                },
                {
                        2.0, 2.20, 1.0, 1.05
                },
                {
                        1.25, 2.0, 2.50, 1.0
                },
                {
                        3.0, 1.5, 1.25, 1.50
                }
        };
        int stock[][] = new int[4][4];
        //inializamos el array de stock de cada golosina en 5
        stock = rellenarMaquina(stock, 5);
        mostrar(Arrays.deepToString(stock));
        boolean salir = false;//para validar el bucle del menu
        double totalVentaEuro = 0;
        int opcion, fila, columna, cantidadStock,pos;

        //desarollamos el menu
        while (!salir) {//!variable booleada indica que es falso->mientra sea falso se repite qhile
            //opciones
            mostrar("\n***** Maquina de Golosinas  ****");
            mostrar("     \uD83C\uDF6C,\uD83C\uDF6C,\uD83C\uDF6C,\uD83C\uDF6C,\uD83C\uDF6C,\uD83C\uDF6C,\uD83C\uDF6C");
            mostrar("   1.➬Pedir golosinas");
            mostrar("   2.➬Mostrar golosinas");
            mostrar("   3.➬Rellenar Stock (admin)");
            mostrar("   4.➬Apagar maquina");
            Scanner sn = new Scanner(System.in);
            mostrarSinLn(" \n Indique su opcion : ");
            opcion = sn.nextInt();
            //hacemos el switch
            switch (opcion) {
                case 1 -> {
                    //pedir las golosinas
                    mostrarSinLn("Indique la posicion de la golosina a comprar");
                    pos=sn.nextInt();
                    //tenemos que validar que la posicion sea >=0 y <33
                    if (pos>=0 && pos<=33 || pos>10 && pos<=13 || pos>=20&pos<=23 ||pos>=30&&pos<=33){
                        //calculamos el valor de la fila
                        fila=(pos%100)/10;
                        columna=pos%10;
                        //desarollar las siguentes opciones
                        //llamar un metodo que controle el stock y me diga true o false si hay catidad suficiente
          if (controlStock(stock,fila,columna)){
           mostrar("Ingresa el dinero" +precios[fila][columna]+ "euros");
           double aux=sn.nextDouble();
           if ((aux>precios[fila][columna])){
               mostrar("Tu cambio es " + (aux-precios[fila][columna]));
           }

           mostrar("Disfruta de tu....." + golosinas[fila][columna] + " \uD83E\uDD21");
           stock[fila][columna]--;
           totalVentaEuro+=precios[fila][columna];

        }else {
        mostrar("No hay " + golosinas[fila][columna] + " en la maquina");

          }

                    }else {
                        mostrar("Opcion no admitida");
                    }
                }
                case 2 -> {
                    //mostrar todos los codicos,los nombres de las golosinas
                    mostrarGlosinas(golosinas,precios);
                }
                case 3 -> {
                    //solicitar la contraseña del tecnico y luego llamar la funcion de rellenar
                mostrar("Ingrese la contraseña autorizada ➬");
                String pass=sn.next();sn.nextLine();
                //validamos que el tecnico introduce la contraseña correcta
                    if (pass.equals("12345")){
                        mostrar("✯✯✯✯✯✯Reponiendo la MAQUINA✯✯✯✯✯✯");
                        for (int i = 0; i < 50; i++) {
                            mostrarSinLn(".");

                        }
                        rellenarMaquina(stock, 5);
                        }else{
                        mostrar("Usuario no autorizado");
                    }
                }
                case 4 -> {
                    //mostrar lo recolectado en las ventas de la maquona (ciere de caja)
                   mostrar("La maquina ha vendido ➬  " +totalVentaEuro +"euros");
                    salir = true;

                }

                default -> mostrar("Opcion no valida");
            }
        }
    }
public static void mostrarGlosinas(String golosinas[][],double precios[][]){
        //necesitamos recorrer el aray de nombres y con posicion obtenemos el precio
    for (int i = 0; i < golosinas.length; i++) {
        for (int j = 0; j < golosinas[i].length; j++) {
            mostrar(i+""+ j + " "+ golosinas[i][j]+" "+ precios[i][j]+" euros");

        }

    }
}
/**
 * metodo que controla el estoc mediante booleanos
 * @param stock
 * @param fila
 * @param columna
 * @return
 * */
public static boolean controlStock(int stock[][],int fila,int columna){
        if (stock[fila][columna]==0){
            return false;
        }else {
            return true;
        }
}
    public static int[][] rellenarMaquina(int stock[][], int valor) {
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] = valor;

            }
        }
        return stock;
    }



        public static void mostrar (String texto){
            System.out.println(texto);
        }

        public static void mostrarSinLn (String texto){
            System.out.println(texto);
        }
    }
