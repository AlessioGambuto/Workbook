package ires.corso.partone.geometric;

import java.util.Scanner;

public class Trapezio {
    public static double computeArea(double basemin, double basemagg, double altezza){
        double area = ((basemin+basemagg)*altezza)/2;
        return area;
    }
}