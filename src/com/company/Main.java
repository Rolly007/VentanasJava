package com.company;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana("Inicio Sesion");
        Ventana.insertarNombre("Juan");
        Ventana.insertarPassword("Pari");
        boolean respuesta = Ventana.validar();

        if(respuesta){
            System.out.println("Bienvenido !!!");
        }
        else{
            System.out.println("Datos Incorrectos!");
        }
    }
}
