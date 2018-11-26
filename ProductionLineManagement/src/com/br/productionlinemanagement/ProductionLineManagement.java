
package com.br.productionlinemanagement;


import java.util.Date;
/**
 * Objeto criado para criar uma LineListFinal contendo uma lista organizada de
 * Objetos Line conforme as regras descritas no teste
 * @author giorgy
 */
public class ProductionLineManagement {

    private TimeTrackingManager timeTrankiManager;
    LineListForProduction lineListFinal;
    LineList lineList;

    public ProductionLineManagement(LineList tracklist) {
        this.timeTrankiManager = new TimeTrackingManager(9, 0, 0);
        this.lineListFinal = new LineListForProduction();
        this.lineList = tracklist;
    }
    
    //Função Analisa a lineList e cria lineListFinal
    public void createLineProduction() {

        while (this.lineList.getSize() >= 0) {

            checkAddLineDay();
            checkAddLine();

            if (this.lineList.getSize() == 0) {
                checkAddLine();
                break;
            }
        }
    }
    
    //Verifica se deve adiconar um lineDay novo na lineListFinal
    public void checkAddLineDay() {
        int hour = this.timeTrankiManager.getHour();
        int minute = this.timeTrankiManager.getMinute();

        if (hour == 9 && minute == 00) {
            this.lineListFinal.addLineDay(1);
        }
    }

    //Verifica qual a line deve ser adicionada na lineListFinal
    public void checkAddLine() {
        this.lineList.sort();
        int time = this.timeTrankiManager.getTrackTimeOfNext();
        Date dateCorruent = this.timeTrankiManager.getTime();

        if (time > 0) {
            Line trackIndicated = this.lineList.getLinelessTime(time);
            if (trackIndicated != null) {
                this.lineListFinal.addLine(dateCorruent, trackIndicated);
                this.lineList.removeLine(trackIndicated);
                this.timeTrankiManager.addMinute(trackIndicated.getTime());
            } else {
                this.lineListFinal.addLine(dateCorruent, "Ginástica laboral");
                this.lineListFinal.addEmpityEspace();
                resetTimeTrackingManager();
            }
            
        } else if (time == -1) {
            this.lineListFinal.addLine(dateCorruent, "Almoço");
            this.timeTrankiManager.addMinute(60);
        } else if (time == -2) {
            this.lineListFinal.addLine(dateCorruent, "Ginástica laboral");
            this.lineListFinal.addEmpityEspace();
            resetTimeTrackingManager();
        } else {
            this.lineListFinal.addLine(dateCorruent, "Ginástica laboral");
            resetTimeTrackingManager();
        }
    }

    //Reseta para hora inicial 
    public void resetTimeTrackingManager() {
        this.timeTrankiManager.setHour(9);
        this.timeTrankiManager.setMinute(0);
        this.timeTrankiManager.setSecond(0);
    }

    public String toString() {
        return this.lineListFinal.toString();
    }

}
