package com.br.productionlinemanagement;

/**
 * Classe criada para suprir as necessidades de uma Line. 
 * Possui dois atributos, nome e tempo. 
 Retorna um objeto do tipo Line
 * @author giorgy
 */
public class Line implements Comparable<Line>{

    private 
        String name;
        int time;

    public Line() {
        this.name = null;
        this.time = 0;
    }
    
    public Line(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    //Impressão do Objeto
    @Override
    public String toString() {
       return String.format("Line{name= %s, time= %d}", this.name, this.time);
    }
    
    //Ordena o objeto pelo tempo
    @Override
    public int compareTo(Line track) {
    
        if (this.time > track.getTime()) {
              return -1;
            }
        if (this.time > track.getTime()) {
              return 1;
            }
         return 0;
         
        
    }
}
    