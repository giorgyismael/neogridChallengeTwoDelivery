
package com.br.productionlinemanagement;
/*
 * Teste desenvolvido para Empresa NeoGrid
 * Data: 23/11/2018
 * @author giorgy
 */
public class Main {

    public static void main(String[] args) {

        ReadInputFile read = new ReadInputFile();
        read.readInputFile("src/com/br/productionlinemanagement/input.txt");
        LineList trackList = read.getLineList();
        trackList.sort();
        
        ProductionLineManagement conferenceTrackManagement;
        conferenceTrackManagement = new ProductionLineManagement(trackList);
        conferenceTrackManagement.createLineProduction();
        System.out.println(conferenceTrackManagement.toString());
        }
    }
        
    
    
