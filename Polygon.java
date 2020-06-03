public class Polygon extends Isosceles
{
	//This Polygon class assumes that the length given to construct the polygon is the incircle radius
	
	private double sides;
	
	public Polygon(double lengthValue, double sidesValue)
	{
		super(lengthValue);
		sides = sidesValue;
	}
	
	// Constructed Polygon has following attributes: 
		// incircle (centre to corner) radius called length (declared in superclass)
		// a number of sides called sides (declared in this class)
	
	public double polygonArea()
	{
		return sides * area(360/sides);
	}
	
	public double polygonPerimeter()
	{
		return sides * baseLength(360/sides); 
	}
	
}