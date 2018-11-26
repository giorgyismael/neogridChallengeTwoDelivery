
package com.br.productionlinemanagement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Objetivo: Classe contem uma listagem de objetos line 
 * Realiza o Controle de operações na lineList
 * @author giorgy
 */
public class LineList {
    private List<Line> lineList;
    
    public LineList(){
        this.lineList = new LinkedList<Line>();
    }
    
    //Criar um Objeto Line e adiciona a lineList. 
    public void addLine(String name, int time){
        this.lineList.add(new Line(name, time));
    }
    
    //Adicionar a lineList um Objeto Line
    public void addLine(Line track){
        this.lineList.add(track);
    }
    
    //remove track da lineList
    public void removeLine(Line track) {
        for (int i = 0; i < this.lineList.size(); i++) {
            Line trackAux = (Line) this.lineList.get(i);
            if (trackAux.equals(track)) {
                this.lineList.remove(i);
            }
        }
    }

    //Retorna tamanho da lista
    public int getSize(){
        return this.lineList.size();
    }

    //Retorna Objeo Line conforme tempo informado
    public Line getLineForTime(int time){
        for (Line track : this.lineList) {
            if (track.getTime() == time) {
                return track;
            }
        }
        return null;
    }

    //Retorna Line com tempo menor que o tempo informado
    public Line getLinelessTime(int time){
        for (Line track : this.lineList) {
            if (track.getTime() <= time) {
                return track;
            }
        }
        return null;
    }
    
    //Retorna a lista
    public List getLineList(){
        return this.lineList;
    }
    
    //Retorna o tamanho da  lista
    public int getLineSize(){
        return this.lineList.size();
    }
    
    //Ordena a lista pelo tempo
    public void sort(){
        Collections.sort(this.lineList);
    }

    //Retorna uma String com todas as posições da tracklist
    public String toString() {
        String lineList = "";

        for (Line track : this.lineList) {
            lineList += track.toString() + "\n";
        }
        return lineList;
    }
}



