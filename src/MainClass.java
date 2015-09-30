import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner tKeyboard = new Scanner(System.in);
		Random tRNG = new Random();
		
		int cpu = tRNG.nextInt(11);
		System.out.println(cpu);
	}

}
