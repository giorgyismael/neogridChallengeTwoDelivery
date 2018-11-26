package com.br.productionlinemanagement;

import java.io.*;

/**
 * Classe análisa um arquivo de texto de dados. Objetivo é buscar os atributos:
 * nome, tempo de de duração. 
 * Cada linha do arquivo é analisado
 * Adiconace um objeto Line a lineList 
 * Monta uma lista com todas as linhas do arquivo de input.txt.
 * @author giorgy
 */
public class ReadInputFile {

    private LineList lineList;

    public ReadInputFile() {
        this.lineList = new LineList();
    }

    //Recebe o caminho do arquivo e: (Abre, Lê, Formata, e adicona um Objeto Line na track Li)
    public void readInputFile(String pathFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            while (br.ready()) {
                String line = br.readLine();
                String stringFormat = formatLineInNameAndTime(line);
                Line newTrack = formatStringInLine(stringFormat);
                this.lineList.addLine(newTrack);
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //Recebe uma string, Retorna uma String nava string formatada com nome e tempo
    public String formatLineInNameAndTime(String line) {
        String name = "";
        String nameAux = "";
        String time = "";

        for (char caracter : line.toCharArray()) {
            if (Character.isDigit(caracter)) {
                time += caracter;
            } else {
                name += caracter;
            }
        }

        nameAux = name.replaceAll("min", "");
        if (time == "") {time = "5";}

        return String.format("%s,%s", nameAux, time);
    }
    
    //Recebe string com nome e tempo, retorna um Objeto Line
    public Line formatStringInLine(String line) {
        String[] preTrack = line.split(",");
        Line track = new Line(preTrack[0], Integer.parseInt(preTrack[1]));
        return track;
    }
   
    //Retorna a LineList
    public LineList getLineList(){
        return this.lineList;
    }
    
    //Impressão da Lista
    public String toString() {
        return this.lineList.toString();

    }
}
