package _1_basicAndHistroy;

public class ObjectPassing {
	
	private double x;
	private double y;
	
	public ObjectPassing(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public ObjectPassing() {
		super();
	}
	
	@Override
	public String toString() {
		return "ObjectPassing [x=" + x + ", y=" + y + "]";
	}

	public double findDistance(ObjectPassing p)
	{
		// here p.x=x2(i.e second object ->p2) , this.x= x1 (i.e first object -> p1)
		double d = Math.sqrt(Math.pow((p.x-this.x), 2)+(Math.pow((p.y-this.y), 2)));
		
		return d;
	}
	
	public static void main(String[] args) {
		
		ObjectPassing p1=new ObjectPassing(3,8);
		ObjectPassing p2=new ObjectPassing(80,21);
		
		// this is example of object passing through method
		System.out.println(p1.findDistance(p2));
		System.out.println(p1);
		System.out.println(p2);
		
	}
	
	

}
