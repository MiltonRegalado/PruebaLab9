/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author suyen
 */
public class Song {
    private int codigo;
 private String nombre;
 private double precio;
 private int sumestrellas = 0;
 private int sumreviews = 0;

    public Song(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public int addStars(int stars){
        if(stars >= 0 && stars <= 5){
            sumestrellas += stars;
            sumreviews++;
            return stars;
        }
        return 0;
    }
    public double SongRating(){
        return sumestrellas/sumreviews;
    }
    public void print(){
        Song rating = new Song(this.codigo, this.nombre, this.precio);
        System.out.println("Codigo: "+codigo+" - Nombre: "+nombre+" - Precio: "+precio+" - Rating: "+rating.SongRating());
    }
}
