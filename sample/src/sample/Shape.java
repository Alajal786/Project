package sample;


import java.sql.SQLException;



public sealed class Shape permits Rectangle {
	double length ;
	double breadth ; 
	double radius;
	
	
	
	

	public Shape(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public static void main(String[] args) throws SQLException {
	

}
}	

	
