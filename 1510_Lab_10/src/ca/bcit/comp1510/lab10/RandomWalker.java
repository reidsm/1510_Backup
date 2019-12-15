package ca.bcit.comp1510.lab10;

import java.util.Random;

public class RandomWalker {

	private int currentX;
	private int currentY;
	private int maxSteps;
	private int currentSteps;
	private int boundarySize;
	private int maximumDistance;
	
	public RandomWalker(int maxSteps, int boundarySize) {
		this.maxSteps = maxSteps;
		this.boundarySize = boundarySize;
		this.currentX = 0;
		this.currentY = 0;
		this.currentSteps = 0;
		this.maximumDistance = 0;
	}
	
	public RandomWalker(int maxSteps, int boundarySize, int currentX, int currentY) {
		this.maxSteps = maxSteps;
		this.boundarySize = boundarySize;
		this.currentX = currentX;
		this.currentY = currentY;
		this.currentSteps = 0;
		this.maximumDistance = 0;
	}

	@Override
	public String toString() {
		return "RandomWalker [currentX=" + currentX + ", currentY=" + currentY + ", currentSteps=" + currentSteps + "]";
	}
	
	public void takeStep() {
		Random rand = new Random();
		int direction = rand.nextInt(4);
		
		switch (direction) {
			
		case 0:
			this.currentX += 1;
			break;
		case 1:
			this.currentX -= 1;
			break;
		case 2: 
			this.currentY += 1;
			break;
		case 3:
			this.currentY -= 1;
			break;
		}
		
		this.currentSteps++; 
		
		this.maximumDistance = max(this.currentX, this.currentY);
		
	}
	
	public int getMaximumDistance() {
		return this.maximumDistance;
	}

	public boolean moreSteps() {
		return (this.currentSteps < this.maxSteps);
	}
	
	public boolean inBounds() {
		int maxX = this.boundarySize;
		int minX = -(this.boundarySize);
		int maxY = this.boundarySize;
		int minY = -(this.boundarySize);
		
		boolean inBoundsX = (this.currentX < maxX && this.currentX > minX);
		boolean inBoundsY = (this.currentY < maxY && this.currentY > minY);
		
		return (inBoundsX && inBoundsY);
	}
	
	public void walk() {
		while (this.moreSteps() && this.inBounds()) {
			this.takeStep();
		}
	}
	
	private int max(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int getCurrentSteps() {
		return this.currentSteps;
	}

	public int getCurrentX() {
		return this.currentX;
	}

	public int getCurrentY() {
		return this.currentY;
	}
	
	
	
}
