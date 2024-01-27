package com.OscarTejerina.AvilaEnTapas.features.pintxos.domain;

public class Pintxo {

    private String id;
    private String nombre;
    private String establecimiento;
    private String puntos;
    private String media;
    private String pariticipantes;
    private String votos;
    private String ingredientes;

    public Pintxo (String id, String nombre,String establecimiento,String puntos, String media, String pariticipantes, String votos, String ingredientes){
        this.id = id;
        this.nombre =nombre;
        this.establecimiento = establecimiento;
        this.puntos = puntos;
        this.media = media;
        this.pariticipantes = pariticipantes;
        this.votos = votos;
        this.ingredientes = ingredientes;

    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public String getPuntos() {
        return puntos;
    }

    public String getMedia() {
        return media;
    }

    public String getPariticipantes() {
        return pariticipantes;
    }

    public String getVotos() {
        return votos;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setPariticipantes(String pariticipantes) {
        this.pariticipantes = pariticipantes;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
