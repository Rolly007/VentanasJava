package com.company;

public class Ventana {
    private String titulo;
    private  Boton entrar;
    private  Etiqueta etiquetaNombre, etiquetaPassword;
    private CampoText campoNombre, campoPassword;

    public Ventana(String titulo){
        this.titulo=titulo;
        this.entrar = new Boton("Entrar");
        this.etiquetaNombre = new Etiqueta("Nombre");
        this.etiquetaPassword = new Etiqueta("Password");
        this.campoNombre = new CampoText("");
        this.campoPassword = new CampoText("");
    }

    public void insertarNombre(String nombre) {
        this.campoNombre.setTexto(nombre);
    }

    public void insertarPassword(String texto) {
        this.campoPassword.setTexto(texto);
    }

    public boolean validar() {
        String nombre = campoNombre.getTexto();
        String pass = campoPassword.getTexto();

        return nombre.equals("pepito")&&pass.equals("1234");
     }
}
