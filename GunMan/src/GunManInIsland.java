import java.util.Scanner;

public class GunManInIsland {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numOfPerson,
			skippedPerson,
			lastServivor = 0;
		
		System.out.print("Numeber of Person in the Island : ");
		numOfPerson = sc.nextInt();
		System.out.print("Numeber of Person is Skipped : ");
		skippedPerson = sc.nextInt();
		
		for (int a = lastServivor + 1; a <= numOfPerson; a++){
			lastServivor = ( lastServivor + skippedPerson ) % a;
		}
		System.out.println("Last Survivor in the Island : "+lastServivor);
		
	}

}
