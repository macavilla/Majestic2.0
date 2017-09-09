/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmajestic;

import com.sun.xml.internal.ws.client.ContentNegotiation;
import elmajestic.classes.Cine;
import java.util.Scanner;

/**
 *
 * @author AULA1
 */
public class MiApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cine majestic = new Cine();
        String codigo;
        boolean deseaSalir = false;

        do {
            System.out.println("Ingrese el código que corresponda");
            System.out.println("AP -> Agregar película.");
            System.out.println("LP -> Listar película.");
            System.out.println("FIN -> Salir de la app.");
            Scanner ingresoCodigo = new Scanner(System.in);
            codigo = ingresoCodigo.nextLine();

            //continuar con el switch
        } while (deseaSalir == false);

        majestic.setNombre("El Majestic");
        majestic.agregarPelicula("Matrix", "Ciencia ficción");
        majestic.agregarPelicula("El secreto de sus ojos", "Suspenso");
        majestic.agregarPelicula("It", "Terror");

        majestic.obtenerInfoPeliculas();
        //tengo que poner el sout acá para que liste peliculas a partir del método
        

        

    }//fin main
}//fin clase ElMajestic
