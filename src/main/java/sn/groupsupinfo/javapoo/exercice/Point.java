/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupsupinfo.javapoo.exercice;

/**
 *
 * @author YANN
 */
public class Point {
    private double x;
    private double y;
    
    public Point() {}
    
    public Point(double abscisse, double ordonnee) 
    {
        this.x = abscisse;
        this.y = ordonnee;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    
    
    
    
    
}
