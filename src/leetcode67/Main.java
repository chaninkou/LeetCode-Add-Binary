package leetcode67;

public class Main {
	public static void main(String[] args) {
		String a = "1010";
		
		String b = "11011";
		
		System.out.println("A: " + a + " B: " + b);
		
		AddBinary solution = new AddBinary();
		
		System.out.println("Solution: " + solution.addBinary(a, b));
	}
}
