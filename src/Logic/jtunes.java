/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author suyen
 */
public class jtunes {
 private Song song[];
  
  public Song SearchSong(int codigo){
      for(Song buscar:song){
          if(buscar != null && buscar.getCodigo() == codigo){
              return buscar;
          }
      }
      return null;
  }
  public boolean addSong(int codigo, String nombre, double precio){
      if(SearchSong(codigo) == null){
          for(int pos = 0; pos < song.length; pos++){
              song[pos] = new Song(codigo, nombre, precio);
          }
          return true;
      }
      return false;
  }
 
}
