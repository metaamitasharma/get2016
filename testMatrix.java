package oop1Matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMatrix {
	
	Matrix mat = new Matrix(3,3);
	int[][] values = {{1,2,3},{3,4,5},{1,7,6}};
    int[][] transposed = {{1,3,1},{2,4,7},{3,5,6}};
    
    
	@Test
	public void test() {
		 mat.getMatrix(values,mat);
		 assertArrayEquals(values, mat.data);
		 mat.transpose(mat);
		 assertArrayEquals(transposed, mat.data);
		 
		
		
	}

}
