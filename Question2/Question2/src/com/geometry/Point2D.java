package com.geometry;



 public class Point2D {
     private int x, y;
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String getDetails() {
        return ("x-cordinate : " + this.x + ", y-cordinate : " + this.y);
    }
    public boolean isEqual(Point2D anotherPoint){
        return this.x==anotherPoint.x && this.y==anotherPoint.y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public Point2D createNewPoint(int x, int y){
        return new Point2D(this.x-x , this.y-y);
    }
    public void calculateDistance(Point2D anotherPoint){
        System.out.println((Math.sqrt(Math.pow((this.x-anotherPoint.x),2)+Math.pow((this.y-anotherPoint.y),2)))); 
    }
}
