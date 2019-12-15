
public class MatrixDriver {
	public static void main(String[] args) {
		Matrix newMatrix = new Matrix(2, 2);
		
		newMatrix.setValue(2, 0, 0);
		newMatrix.setValue(3, 0, 1);
		newMatrix.setValue(4, 1, 0);
		newMatrix.setValue(5, 1, 1);
		
		System.out.println(newMatrix);
		
		Matrix newMatrix2 = new Matrix(2, 2);
		
		newMatrix2.setValue(1, 0, 0);
		newMatrix2.setValue(2, 0, 1);
		newMatrix2.setValue(3, 1, 0);
		newMatrix2.setValue(4, 1, 1);
		
		System.out.println(newMatrix2);
		
		Matrix addedMatrix = newMatrix.add(newMatrix2);
		System.out.println(addedMatrix);
		
		Matrix rectangleMatrix = new Matrix(2, 3);
		
		rectangleMatrix.setValue(1, 0, 0);
		rectangleMatrix.setValue(2, 0, 1);
		rectangleMatrix.setValue(3, 0, 2);
		rectangleMatrix.setValue(4, 1, 0);
		rectangleMatrix.setValue(5, 1, 1);
		rectangleMatrix.setValue(6, 1, 2);
		
		System.out.println(rectangleMatrix);
		
		try {
			rectangleMatrix.add(newMatrix);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		Matrix multMatrix = new Matrix(2, 3);
		multMatrix = newMatrix2.multiply(rectangleMatrix);
		System.out.println(multMatrix);
		
		try {
			Matrix multMatrix2 = new Matrix(2, 3);
			multMatrix2 = rectangleMatrix.multiply(newMatrix2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
