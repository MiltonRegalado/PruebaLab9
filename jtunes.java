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
  private Song song[] = new Song[10];
  
  public Song SearchSong(int codigo){
      for(Song buscar:song){
          if(buscar != null && buscar.getCodigo() == codigo){
              return buscar;
          }
      }
      return null;
  }
  //PELIER WAS HERE
  public boolean addSong(int codigo, String nombre, double precio){
      if(SearchSong(codigo) == null){
          for(int pos = 0; pos < song.length; pos++){
              song[pos] = new Song(codigo, nombre, precio);
          }
          return true;
      }
      return false;
  }
  public String rateSong(int estrellas, int codigo){
      if(SearchSong(codigo) != null){
          for(int pos = 0; pos < song.length; pos++){
              if(SearchSong(codigo).equals(codigo)){
                  song[pos].addStars(estrellas);
                  return song[pos].print();
              }
          }
      }
      return "This song doesnt exists";
  }
  public String songList(int code){
      for (int pos = 0; pos < song.length;pos++){
          if(SearchSong(code) != null){
                return song[pos].print(); 
      }
      }
      return "This song doesnt exists";
  }
  public String printSong(){
      for(int pos = 0; pos < song.length; pos++){
          return song[pos].print();
      }
      return null;
  }
}
