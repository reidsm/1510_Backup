
public class Matrix {

	int[][] matrix;
	
	public Matrix(int numRows, int numColumns) {
		this.matrix = new int[numRows][numColumns];
	}
	
	public int getRows() {
		return matrix.length;
	}
	
	public int getColumns() {
		return matrix[0].length;
	}
	
	public int getValue(int row, int column) {
		return this.matrix[row][column];
	}
	
	public void setValue(int value, int row, int column) {
		this.matrix[row][column] = value;
	}
	
	public String toString() {
		String matrixString = "";
		for (int row = 0; row < this.matrix.length; row++) {
			matrixString += "\n";
			for (int column = 0; column < this.matrix[0].length; column++) {
				matrixString += this.matrix[row][column] + " ";
			}
		}
		return matrixString;
	}
	
	public Matrix add(Matrix other) {
		boolean rowsEqual = this.getRows() == other.getColumns();
		boolean columnsEqual = this.getColumns() == other.getColumns();
		
		Matrix temp = new Matrix(this.getRows(), this.getColumns());
		
		if (rowsEqual && columnsEqual) {
			
			for (int row = 0; row < this.matrix.length; row++) {
				for (int column = 0; column < this.matrix[0].length; column++) {
					int value = this.matrix[row][column] + other.getValue(row, column);
					temp.setValue(value, row, column);
				}
			}
		} else {
			throw new IllegalArgumentException("You must add matricies of the same dimensions.");
		}
		return temp;
	}
	
	public Matrix multiply(Matrix other) {
		boolean validOperation = (this.getColumns() == other.getRows());
		
		Matrix temp = new Matrix(this.getRows(), other.getColumns());
		
		if (validOperation) {
			for (int rows = 0; rows < temp.getRows(); rows++) {
				for (int columns = 0; columns < temp.getColumns(); columns++) {
					for (int dot = 0; dot < this.getColumns(); dot++) {
						int firstHalfDot = temp.getValue(rows, columns);
						int secondHalfDot = this.matrix[rows][dot] * other.getValue(dot, columns);
						int value = firstHalfDot + secondHalfDot;
						temp.setValue(value, rows, columns);
					}
				}
			}
		} else {
			throw new IllegalArgumentException("When multiplying matricies C1 must equal R2");
		}
		return temp;
	}
	
}
