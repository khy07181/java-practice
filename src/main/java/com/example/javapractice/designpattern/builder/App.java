package com.example.javapractice.designpattern.builder;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = director.cancunTrip();
        TourPlan longBeachTrip = director.longBeachTrip();

        System.out.println(cancunTrip);
        System.out.println(longBeachTrip);
    }
}
