package assign1prc;

import java.util.Stack;

public class Floor {

	public Stack<Integer> floorSizesStack = new Stack<>();

	public Floor() {

		System.out.println("The order of construction is as follows :");

	}

	// this is the method that will construct the building
	public void constructFloor(int requiredFloorSize, int[] floorSizes) {
		// for each floor size provided
		for (int i = 0; i < floorSizes.length; i++) {

			System.out.println("\nDay: " + (i + 1));// day
			// check if the floor size matches the order of the floor required
			// if not then print blank and push this floorsize onto stack
			if (floorSizes[i] != requiredFloorSize) {
				System.out.print(" ");
				floorSizesStack.push(floorSizes[i]);

			} else {

				// we can assemble this floor and if any left in stack
				System.out.print(floorSizes[i] + " ");
				// reduce the next floorsize needed as
				requiredFloorSize -= 1;

				// print the floor-size pending from the stack if it is the next we need
				while (!floorSizesStack.isEmpty() && requiredFloorSize == floorSizesStack.peek()) {

					// if found then it means we can assemble this floor too
					System.out.print(floorSizesStack.pop() + " ");
					// , reduce the required floor size till true
					requiredFloorSize -= 1;
				}
			}
		}
	}

}
