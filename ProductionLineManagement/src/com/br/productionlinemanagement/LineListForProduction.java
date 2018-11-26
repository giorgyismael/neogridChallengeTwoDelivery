
package com.br.productionlinemanagement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/**
 * Objeto criado para unir os atributos necessários para a listagem final da linha de produção
 * @author giorgy
 */
public class LineListForProduction {

    private List<String> lineListFinal;
    int lineDay;

    public LineListForProduction() {
        this.lineListFinal = new LinkedList<String>();
        this.lineDay = 0;

    }

    //Adiciona o a variavel lineDay na lista da conferencia
    public void addLineDay(int day) {
        String track;
        this.lineDay += day;
        track = "Linha de montagem " + this.lineDay  + ":";
        
        this.lineListFinal.add(track);
    }
 
    //Adiciona Espaço em branco na lista
    public void addEmpityEspace() {
   
        this.lineListFinal.add("");
    }

    //Adiciona uma track na lista da conferencia
    public void addLine(Date date, Line track) {
        String trackAux;
        if (track.getTime() <= 5)
            trackAux = formatToNorthAmerica(date) + " " + track.getName();
        else
            trackAux = formatToNorthAmerica(date) + " " + track.getName() + track.getTime() + "min";
        this.lineListFinal.add(trackAux);
    }
   
    //Adiciona uma track na lista da conferencia
    public void addLine(Date date, String nameTrack) {
        String trackAux;
        trackAux = formatToNorthAmerica(date) + " " + nameTrack;
        this.lineListFinal.add(trackAux);
    }

    //Recebe um Objeto date e Retorna uma String com a data formatada no padrão Norte Americano
    public String formatToNorthAmerica(Date dateConvert) {
        String response;

        SimpleDateFormat TrackTime = new SimpleDateFormat("hh:mmaa");
        response = TrackTime.format(dateConvert);
        return response;
    }

    //Retorna uma String com todas as posições da tracklist
    public String toString() {
        String trackList = "";

        for (String track : this.lineListFinal) {
            trackList += track.toString() + "\n";
        }

        return trackList;
    }
}
