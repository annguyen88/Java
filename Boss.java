public class Boss {
	String name;

	Boss(String s){
		name = "This is the Boss, " + s;
		System.out.println(name);
	}

	public static void main(String args[]){
		String hello = "Amy";
		Boss stuff = new Boss(hello);
	}
}
