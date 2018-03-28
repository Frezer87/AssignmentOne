package com.frezer;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String userInputArraySize = JOptionPane.showInputDialog(null,
                "How many cities you would like to enter?: ");
        int sizeOfArray = Integer.parseInt(userInputArraySize);
        String[] cities = new String[sizeOfArray];
        double[] temperature = new double[sizeOfArray];

        int i = 0;
        while (i < sizeOfArray) {
            cities[i] = JOptionPane.showInputDialog("Enter City name :");
            temperature[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature for  " + cities[i] + ":"));
            i++;
        }
        // I used overload methods to return more than one values and different type of values, but I would
        // like to learn another ways how to return more than one values without using overloading methods.
        // Thank you!

        String cityHigh = findHighTemperature(cities,temperature);
        double tempHigh = findHighTemperature(temperature);
        String cityLow = findLowTemperature(cities,temperature);
        double tempLow = findLowTemperature(temperature);
        double avarage = findAverageTemperature(temperature);


        JOptionPane.showMessageDialog(null,
        cityHigh+" has the highest temperature, which is "+tempHigh+"\u00b0" + "F"+"\n "+
         cityLow+ " has the lowest temperature, which is " +tempLow+"\u00b0" + "F"+"\n" +
                "The average temperature is "+avarage+"\u00b0" + "F");
        JOptionPane.showMessageDialog(null,"Good buy from Frezer");


    }
    public static double findHighTemperature( double[] temperature) {
        double max = temperature[0];
        double tempHigh = temperature[0];

        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > max) {
                max = temperature[i];
                tempHigh = temperature[i];
            } // end if
        }//end for
        return tempHigh;
    }
    public static String findHighTemperature(String[] cities, double[] temperature) {
        double max = temperature[0];
        String cityHigh = cities[0];
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > max) {
                max = temperature[i];
                cityHigh = cities[i];
            } // end if
        }//end for
        return cityHigh;
    }

    public static double findLowTemperature(double[] temperature) {
        double min = temperature[0];
        double tempLow = temperature[0];

        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < min) {
                min = temperature[i];
                tempLow = temperature[i];
            }// end if
        } // end for
        return tempLow;
    }
    public static String findLowTemperature(String[] cities, double[] temperature) {
        double min = temperature[0];
        String cityLow = cities[0];
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < min) {
                min = temperature[i];
                cityLow = cities[i];
            }// end if

        } // end for
        return cityLow;
    }

    public static double findAverageTemperature(double[] temperature) {
        double sum=0;
        double avarage=0;
        for (int i=0; i < temperature.length;i++) {
            sum = sum + temperature[i];
            avarage = sum / temperature.length;
        }
     return avarage;
    }

}