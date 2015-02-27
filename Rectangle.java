interface Mensuration {
	public int calculatePerimeter();
	public int calculateArea();
}

class Rectangle implements Mensuration{
	private int length, breadth;

	public Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public int calculatePerimeter(){
		return 2*(this.length + this.breadth);
	}
	
	public int calculateArea(){
		return (this.length * this.breadth);
	}
}

class Square implements Mensuration{
	private int side;

	public Square(int side){
		this.side = side;
	}
	
	public int calculatePerimeter(){
		return 4*this.side;
	}
	
	public int calculateArea(){
		return this.side*this.side;
	}
}

class Program{
	public static void main(String[] args) {
		int length = 2, breadth = 2, side = 3;

		Rectangle rect = new Rectangle(length,breadth);
		Square sq = new Square(side);
		
		int perimeterOfRect = rect.calculatePerimeter();
		int areaOfRect = rect.calculateArea();
		int perimeterOfSq = sq.calculatePerimeter();
		int areaOfSq = sq.calculateArea();

		System.out.println("perimeterOfRect of "+length + " and " + breadth +" is "+perimeterOfRect);
		System.out.println("areaOfRect of "+length + " and " + breadth +" is "+ areaOfRect);
		System.out.println("perimeterOfSQ of "+side +" is "+perimeterOfSq);
		System.out.println("areaOfSQ of "+side +" is "+ areaOfSq);
	}
}