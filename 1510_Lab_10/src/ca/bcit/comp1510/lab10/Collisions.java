package ca.bcit.comp1510.lab10;

public class Collisions {
	
	public static void main(String[] args) {
		final int maxSteps = 100000;
		final int boundarySize = 2000000;
		int numCollisions = 0;
		
		RandomWalker particleA = new RandomWalker(maxSteps, boundarySize, -3, 0);
		RandomWalker particleB = new RandomWalker(maxSteps, boundarySize, 3, 0);
		
		for (int i = 0; i < maxSteps; i++) {
			particleA.takeStep();
			particleB.takeStep();
			
			if (samePosition(particleA, particleB)) {
				numCollisions++;
			}
		}
		
		System.out.println("The two particles collided " + numCollisions + " times.");
		System.out.println("Particle A reached a distance of " + particleA.getMaximumDistance() + ".");
		System.out.println("Particle B reached a distance of " + particleB.getMaximumDistance() + ".");
		
	}
	
	public static boolean samePosition(RandomWalker a, RandomWalker b) {
		boolean sameX = (a.getCurrentX() == b.getCurrentX());
		boolean sameY = (a.getCurrentY() == b.getCurrentY());
		
		return (sameX && sameY);
	}

}
