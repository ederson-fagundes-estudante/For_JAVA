import java.util.Scanner;
public class ex_1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static float scanFloat(String text) {
		print(text);
		return sc.nextFloat();
	}

	public static void main(String[] args) {
		float quantidade = scanFloat("Quantos o valor?");
		
		for(int x=1; x<=10; x++) {
			print("Vezes "+x+": "+(x*quantidade));
		}
		
		sc.close();
	}

}
