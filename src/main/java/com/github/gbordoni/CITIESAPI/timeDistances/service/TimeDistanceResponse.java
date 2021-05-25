package com.github.gbordoni.CITIESAPI.timeDistances.service;


public class TimeDistanceResponse {
    private final Double conversionConstant = 1.60934;
    private final Double byPlaneAverageSpeed = 600.0;
    private String city1;
    private String city2;
    private Double distance;

    public TimeDistanceResponse(String city1, String city2){this.city1 = city1; this.city2 = city2;}

    public void setDistance(Double distance){this.distance = distance * conversionConstant;}

    private String getTime(Double speed){
        int totalHour =  (int) (this.distance/speed);
        int hour = totalHour % 24;
        int minutes = (int) (60 * (this.distance/speed - totalHour));
        return (String.valueOf(hour)+"h:"+String.valueOf(minutes)+"min");
    }

    @Override
    public String toString(){
        String line1 = "##### FROM " +city1 + " TO " +city2 +" ###";
        String line2 = " GEOGRAPHICAL DISTANCE: " +String.valueOf(Math.round(distance))+ "Km ####";
        String line3 = " AVERAGE TIME BY PLANE: " + getTime(byPlaneAverageSpeed)+" ######";
        return line1+line2+line3;
    }

}
