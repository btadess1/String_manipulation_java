package basics;

public class StringManipulatorTester {

	public static void main(String[] args) {
		
		
		StringManipulator manipulate = new StringManipulator();
		System.out.println(manipulate.concatSubString("Hello", 1, 2, "World"));
		System.out.println(manipulate.getIndexOrNull("Ethiopia", "iop"));
		System.out.println(manipulate.trimAndConcat("  God is good ",  " all the time "));
	}

}
