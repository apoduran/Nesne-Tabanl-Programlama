
package program2;

import java.util.Random;

public class Program2 {
	private static int dizi[];
	private static int boy = 10;

	static {
		dizi = new int[boy];
		Random rnd = new Random();

		for(int i=0; i < boy; i++)
			dizi[i] = rnd.nextInt(100);
	}
}