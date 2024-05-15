/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author utpl
 */
public class Ejecutor2 {

    public static void main(String[] args) {

        double[] notas = {10, 9, 8, 10};
        String nombreEstudiante = "Rene Elizalde";
        LibretaCalificacion x = new LibretaCalificacion(
                nombreEstudiante,
                notas);
        
        x.establecerPromedio();      
        x.establecerPromedioCualitativo();
        // si es que no se llama a estos 2 metodos no podremos obtener el valor 
        // del promedio de las calificaciones ya que mediante el metodo 
        // realizamos el calculo del mismo y si no se lo hace dara de promedio
        // el valor de 0, y si no llamamos al metodo del promedio cualitativo 
        // no podra establecerle el valor y retornara un valor nulo (null)
        System.out.printf("%s", x);

    }

}
