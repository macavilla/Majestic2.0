/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmajestic.classes;

import java.util.ArrayList;

/**
 *
 * @author AULA1
 */
public class Cine {

    private String nombre;
    private ArrayList<Pelicula> listaPelicula = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pelicula> getListaPelicula() {
        return listaPelicula;
    }

    public void setListaPelicula(ArrayList<Pelicula> listaPelicula) {
        this.listaPelicula = listaPelicula;
    }

    public void agregarPelicula(String titulo, String genero) {
        Pelicula unaPelicula = new Pelicula();
        unaPelicula.setTitulo(titulo);
        unaPelicula.setGenero(genero);

        listaPelicula.add(unaPelicula);
    }

    //tengo que convertir mi listaPeliculas en un Array<String>
    //porque no quiero que MiApp acceda a Pelicula
    public ArrayList<String> obtenerInfoPeliculas() {
        //creo un array listado, inicializo
        ArrayList<String> listado = new ArrayList<String>();
        // fore recorre un listado (en este caso listaPelicula) y los asigna a una nueva
        //pelicula de Clase Pelicula

        for (Pelicula pelicula : listaPelicula) {
            //agrego a listado cada pelicula recorrida, con getter obtengo los atributos de Pelicula
            listado.add(pelicula.getTitulo() + " - " + pelicula.getGenero());

        }
        return listado;
    }

}//fin clase Cine
