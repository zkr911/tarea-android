package com.nilson.tareaandroid;

public class infodato {

    String nombre,apellido,genero,recomendar,selecspin,rank;

    public infodato(String nombre, String apellido, String genero, String recomendar, String selecspin, String rank) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.recomendar = recomendar;
        this.selecspin = selecspin;
        this.rank = rank;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRecomendar() {
        return recomendar;
    }

    public void setRecomendar(String recomendar) {
        this.recomendar = recomendar;
    }

    public String getSelecspin() {
        return selecspin;
    }

    public void setSelecspin(String selecspin) {
        this.selecspin = selecspin;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
