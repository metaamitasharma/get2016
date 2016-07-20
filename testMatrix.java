package oop1Matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMatrix {
	
	Matrix mat = new Matrix(3,3);
	Matrix mat1 = new Matrix(3,3);
	int[][] values = {{1,2,3},{3,4,5},{1,7,6}};
    int[][] transposed = {{1,3,1},{2,4,7},{3,5,6}};
    int[][] unit = {{1,0,0},{0,1,0},{0,0,1}};
    
	@Test
	public void test() {
		 mat.getMatrix(values,mat);
		 assertArrayEquals(values, mat.data);
		 mat.transpose(mat);
		 assertArrayEquals(transposed, mat.data);
		 mat1.getMatrix(unit,mat1);
	     assertArrayEquals(transposed, (mat1.multiply(mat, mat1)).data); //multiplication of a matrix with 
	                                                                     //unit matrix results in matrix itself
	}

}
