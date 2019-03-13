package com.example.mariano.din.modelo;

public class Sura {

    private String tituloar;
    private String traducciones;
    private String transcripcion;

    public Sura(String tituloar, String transcripcion, String traducciones) {
        this.tituloar = tituloar;
        this.traducciones = traducciones;
        this.transcripcion = transcripcion;
    }

    public Sura(String transcripcion, String traducciones) {
        this.traducciones = traducciones;
        this.transcripcion = transcripcion;
    }

    public String getTituloar() {
        return tituloar;
    }

    public void setTituloar(String tituloar) {
        this.tituloar = tituloar;
    }

    public String getTraducciones() {
        return traducciones;
    }

    public void setTraducciones(String traducciones) {
        this.traducciones = traducciones;
    }

    public String getTranscripcion() {
        return transcripcion;
    }

    public void setTranscripcion(String transcripcion) {
        this.transcripcion = transcripcion;
    }
}
