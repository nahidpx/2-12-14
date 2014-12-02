import java.util.Scanner;

public class PiratesInTheIsland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numOfPirates,
			numOfCoconut,
			monkeyGetCoconuts = 0,
			onePirateGetCoconut,
			cocoRest,
			piratesLeft = 0;
		
		System.out.print("Numeber of pirates in the Island: ");
		numOfPirates = sc.nextInt();
		System.out.print("Numeber of Coconuts: ");
		numOfCoconut = sc.nextInt();
		
		while( ( numOfPirates < numOfCoconut ) && (numOfPirates > piratesLeft) ){
			cocoRest = numOfCoconut % numOfPirates;
			if (cocoRest == 0) {
				onePirateGetCoconut = numOfCoconut / numOfPirates;
				numOfCoconut = numOfCoconut - onePirateGetCoconut;
			} else {
				monkeyGetCoconuts = monkeyGetCoconuts + cocoRest;
				numOfCoconut = numOfCoconut - cocoRest;
				onePirateGetCoconut = numOfCoconut / numOfPirates;
				numOfCoconut = numOfCoconut - onePirateGetCoconut;
			}
			//System.out.println(onePirateGetCoconut);

			
			if (piratesLeft == 0) {
				System.out.println("First Pirate Steal Coco : " + onePirateGetCoconut);
			}
			piratesLeft ++;
			
			if ( piratesLeft >= numOfPirates ) {
				
				System.out.println("Last Pirate Steal Coco : " + onePirateGetCoconut);
			}
		}
		System.out.println("Monkey Gets Coconuts : "+monkeyGetCoconuts);		
	}

}
