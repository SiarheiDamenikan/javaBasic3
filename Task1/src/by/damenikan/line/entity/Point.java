package by.damenikan.line.entity;

public class Point {
	private double x;
	private double y;
	private double z;
	
	public Point(){
		
	}
	public Point(double x, double y, double z){
		this.x = x; 
		this.y = y; 
		this.z = z; 
		
	}
	public void setX(double x) {
		this.x = x; 
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y = y; 
	}
	
	public double getY() {
		return this.y;
	}

	public void setZ(double z) {
		this.z = z; 
	}
	
	public double getZ() {
		return this.z;
	}
	
}
