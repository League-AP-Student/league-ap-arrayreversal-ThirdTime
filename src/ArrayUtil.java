


public class ArrayUtil {
	
	/** Reverse elements of array arr
	*   Precondition: arr.length > 0.
	*   Postcondition: The elements of arr have been reversed
	*   @param arr the array to manipulate
	*/
	public static void reverseArray(int[] arr){
		int [] tempArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			tempArr[i] = arr[i];
		}
		int counter = 0;
		for(int i = arr.length-1; i >=0;i--) {
			arr[counter]=tempArr[i];
			counter++;
		}
	}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	/** Revereses the elements in each row of mat.
	*   Postcondition: The elements in each row have been reversed
	*/
	public void reverseAllRows(){
		for(int i = 0; i < mat.length;i++) {
			ArrayUtil.reverseArray(mat[i]);
		}
	}
	
	/** Reverses the elements of mat.
	*   Postcondition:
	*   - The final elements of mat, when read in row-major order, 
	*     are the same as the original elements of mat when read
	*     from the bottom corner, right to left, going upward.
	*   - mat[0][0] contains what was originally the last element.
	*   - mat[mat.length - 1][mat[0].length -1] contains what was
	*     originally the first element.
	*/
	public void reverseMatrix(){
		reverseAllRows();
		int midPt = mat.length / 2;
		for(int i = 0; i < midPt; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				int tempVal = mat[i][j];
				mat[i][j] = mat[mat.length - 1 - i][j];
				mat[mat.length - 1 - i][j] = tempVal;
			}
		}
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}
