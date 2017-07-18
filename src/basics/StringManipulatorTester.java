package basics;

public class StringManipulatorTester {

	public static void main(String[] args) {
		
		
		StringManipulator manipulate = new StringManipulator();
		System.out.println(manipulate.concatSubString("Hello", 1, 2, "World"));
		System.out.println(manipulate.getIndexOrNull("Ethiopia", "thi"));
		System.out.println(manipulate.trimAndConcat("  Life is good ",  " all the time "));
	}

}
