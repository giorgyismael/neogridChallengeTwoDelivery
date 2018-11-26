
package com.br.productionlinemanagement;

import java.util.Calendar;
import java.util.Date;

/**
 * Objetivo: Classe criada para gerenciar o tempo da linha
 * Neste Objeto estão inseridas todas as regras de tempo solicitadas no teste
 * @author giorgy
 */
public class TimeTrackingManager {

    private Calendar timeTrackingManager;

    //Inicializa a classe com a date e hora corrente
    public TimeTrackingManager() {
        this.timeTrackingManager = Calendar.getInstance();
    }

    //Inicializa a classe com uma data determinada
    public TimeTrackingManager(Date date) {
        this.timeTrackingManager = Calendar.getInstance();
        this.timeTrackingManager.setTime(date);
    }

    //Inicializa a classe e permite definir os parametros de (hora, minuto e segundo)
    public TimeTrackingManager(int hour, int minute, int second) {
        this.timeTrackingManager = Calendar.getInstance();
        this.timeTrackingManager.set(Calendar.HOUR_OF_DAY, hour);
        this.timeTrackingManager.set(Calendar.MINUTE, minute);
        this.timeTrackingManager.set(Calendar.SECOND, second);
    }

    //Inicializa a classe e permite definir uma data completa (diaDoMes, mês, ano, hora, minuto e segundo)
    public TimeTrackingManager(int dayOfMonth, int month, int year, int hour, int minute, int second) {
        this.timeTrackingManager = Calendar.getInstance();
        this.timeTrackingManager.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        this.timeTrackingManager.set(Calendar.MONTH, month);
        this.timeTrackingManager.set(Calendar.YEAR, year);
        this.timeTrackingManager.set(Calendar.HOUR_OF_DAY, hour);
        this.timeTrackingManager.set(Calendar.MINUTE, minute);
        this.timeTrackingManager.set(Calendar.SECOND, second);
    }

    //Define os segundos da timeTrackingManager
    public void setSecond(int sec) {
        this.timeTrackingManager.set(Calendar.SECOND, sec);
    }

    //Define os minutos da timeTrackingManager
    public void setMinute(int min) {
        this.timeTrackingManager.set(Calendar.MINUTE, min);
    }

    //Define a hora da timeTrackingManager
    public void setHour(int hour) {
        this.timeTrackingManager.set(Calendar.HOUR_OF_DAY, hour);
    }

    //Adiciona os minutos da timeTrackingManager
    public void addMinute(int min) {
        this.timeTrackingManager.add(Calendar.MINUTE, min);
    }

    //Adiciona a hora da timeTrackingManager
    public void addHour(int hour) {
        this.timeTrackingManager.add(Calendar.HOUR_OF_DAY, hour);
    }

    //Pega o tempo corrente
    public Date getTime() {
        return this.timeTrackingManager.getTime();
    }

    //Retorna os minutos do timeTrackingManager
    public int getMinute() {
        return this.timeTrackingManager.get(Calendar.MINUTE);
    }

    //Retorna as horas do timeTrackingManager
    public int getHour() {
        return this.timeTrackingManager.get(Calendar.HOUR);
    }

    //Retorna o tempo restante para um determinado tempo
    public int getTrackTimeOfNext() {
        String check = checkHourOfManagerTime();
        return checkTrackTimeOfNext(check);
    }

    //Soma um tempo em minutos no Controle do tempo
    public Date sumMinManagerTime(int min) {
        this.timeTrackingManager.add(Calendar.MINUTE, min);
        return this.timeTrackingManager.getTime();
    }

    //Retorna em minutos a adiçãoo de Milesegundos 
    public int sumInMilliseconds(long timeMill00, long timeMill01) {
        return (int) (timeMill00 + timeMill01) / 60000;
    }

    //Retorna em minutos a subtração de Milesegundos 
    public int subInMilliseconds(long timeMill00, long timeMill01) {
        return (int) (timeMill00 - timeMill01) / 60000;
    }

    //Retorna o tempo em minutos, caso seja diferente de 0
    //Retorna -1 se  12:00 <= tempo <= 12:59, ou -2  16:59 >= tempo )
    public int checkTrackTimeOfNext(String check) {
        Calendar calendarAux = Calendar.getInstance();
        int time = 0;
        switch (check) {
            case "Morning Line":
                calendarAux.set(Calendar.HOUR_OF_DAY, 12);
                calendarAux.set(Calendar.MINUTE, 00);
                calendarAux.set(Calendar.SECOND, 00);
                time = subInMilliseconds(calendarAux.getTimeInMillis(),
                        this.timeTrackingManager.getTimeInMillis());
                if (time <= 0) {
                    time = -1;
                }

                return time;

            case ("Afternoon Line"):
                calendarAux.set(Calendar.HOUR_OF_DAY, 16);
                calendarAux.set(Calendar.MINUTE, 59);
                calendarAux.set(Calendar.SECOND, 00);
                time = subInMilliseconds(calendarAux.getTimeInMillis(),
                        this.timeTrackingManager.getTimeInMillis());

                if (time <= 0) {
                    time = -2;

                }
                return time;
            
            case ("Labor Gymnastics"):
                   time = -2;
                return time;
        }
        return time;
    }

    //Retorna uma string informando qual momento do tempo conforme as regras do Teste
    //9:00 <=tempo<=11:59 = Morning Tracks, 
    //12:00 <=tempo<=12:59 = Lunch, 
    //13:00 <=tempo<=16:59 = Afternoon Tracks, 
    //tempo > 16:59 = Networking Event
    public String checkHourOfManagerTime() {
        int hour = this.timeTrackingManager.get(Calendar.HOUR_OF_DAY);
        int minute = this.timeTrackingManager.get(Calendar.MINUTE);
        String check = "";

        if (hour >= 9 && hour <= 12) {
            if (hour == 12 && minute > 00) {
                check = "Almoço";
            } else {
                check = "Morning Line";
            }

        } else if (hour >= 12 && hour <= 13) {
            if (hour == 12 && minute <= 59) {
                check = "Almoço";
            } else {
                check = "Afternoon Line";
            }

        } else if (hour >= 13 && hour <= 17) {
            if (hour == 16 && minute > 59) {
                check = "Labor Gymnastics";
            } else if (hour >= 17) {
                check = "Labor Gymnastics";
            } else {
                check = "Afternoon Line";
            }
        } else {
            check = "Labor Gymnastics";
        }
        return check;
    }
}
