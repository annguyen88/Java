public class Boss {
	String name;
	
	Boss(String input) { //This is a contructor
		name = "Our Boss is also known as: " + input;
		
	}
	
	public static void main(String args[]){
		Boss p1 = new Boss("Super-Man");
		Boss p2 = new Boss("Iron-Man");
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.name);
	}
}
