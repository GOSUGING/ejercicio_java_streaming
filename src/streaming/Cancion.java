/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streaming;


/**
 *
 * @author Aron
 */
public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;
    private boolean favorita;
    private boolean descargada;
// constructor 1 inicializado
    
    public Cancion(String titulo, String artista, int duracion, boolean favorita, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }

// constructor 2 

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = false;
        this.descargada = false;        
    }
    
// getters
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public boolean getFavorita() {
        return favorita;
    }
    
    public boolean getDescargada() {
        return descargada;
    }
    
// setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }
    
// metodo personalizado 1
    
    public void adelantar(int segundos) {
        this.duracion += segundos;
    }

// metódo personalizado 2
    
    public void imprimirDetalles() {
        int minutos = duracion / 60;
        int segundos = duracion % 60;
        System.out.println("Título: " + titulo + ", Artista: " + artista + ", Duración: " + minutos + ":" + (segundos < 10 ? "0" : "") + segundos);
    }

//metódo personalizado 3
    
    public String esLarga(){
        return duracion >= 300 ? "Larga: " : "Normal";
    }









}
