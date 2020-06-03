public class Test
{
	
	public static void main(String [] args)
	{
		
		//Isosceles iso = new Isosceles(1);
		//System.out.println("<--- Isosceles --->" );
		//System.out.println("Base length: " + iso.baseLength(30) );
		//System.out.println("Above results are correct" );
		//System.out.println("" );
		
		Polygon jim = new Polygon(1, 8);
		System.out.println("<--- Polygon --->" );
		System.out.println("area:   " + jim.polygonArea());
		System.out.println("perimeter:   " + jim.polygonPerimeter());
		
	}
}