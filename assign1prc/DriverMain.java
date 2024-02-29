package assign1prc;

import java.util.Arrays;
import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking input for number of floors
		System.out.print("Enter the total number of floors in the building:");

		int totalfloor = sc.nextInt();

		int[] floorSizes = new int[totalfloor];

		// Taking input for floor sizes
		for (int i = 0; i < floorSizes.length; i++) {

			// day = i + 1;
			System.out.println("Enter the floor size given on day :" + (i + 1));// day

			int size = sc.nextInt();

			if (size <= 0) {

				System.out.println("Floor size cannot be less than or equal to zero");
				i--;
			} else if (size > totalfloor) {

				System.out.println("Floor size cannot be greater than total floor");
				i--;
			} else {
				floorSizes[i] = size;
			}
		}

		System.out.println(Arrays.toString(floorSizes));
		Floor SkyscraperConstruction = new Floor();

		SkyscraperConstruction.constructFloor(totalfloor, floorSizes);
		sc.close();
	}

}
