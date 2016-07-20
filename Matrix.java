package oop1Matrix;

public class Matrix {
	int row;
	int col;
	int data[][];
	
	public Matrix(int row,int col)         //constructor
	{
		this.row=row;
		this.col=col;
		data = new int[row][col];
	}

	public void addElement(int r,int c,int value)
	{
		data[r][c]=value;

	}
	
	public void getMatrix(int[][] arr,Matrix mat)    //copies 2D array elements into
	                                                 //data part of Matrix
	{
		for(int i=0;i<mat.row;i++)
		{
			for(int j=0;j<mat.col;j++)
			{
				mat.addElement(i,j,arr[i][j]);
			}
		}
	}
	
	public void transpose(Matrix mat)
	{
		int[][] trans =new int[mat.col][mat.row];
		for(int i=0;i<mat.row;i++)
		{
			for(int j=0;j<mat.col;j++)
			{
				trans[i][j]=mat.data[j][i];
			}
		}
		mat.data=trans;
	}
	
	public void show(Matrix mat)                   //display Matrix
	{
		for(int i=0;i<mat.row;i++)
		{
			for(int j=0;j<mat.col;j++)
			{
			  System.out.print(mat.data[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
	public Matrix multiply(Matrix mat1,Matrix mat2)
	{
		Matrix mult = new Matrix(mat1.row,mat2.col);
		//int[][] multData= new int[mat1.row][mat2.col];
		if(mat1.col==mat2.row)
		{
			for(int i=0;i<mat1.row;i++)
			{
				for(int j=0;j<mat2.col;j++)
				{
					mult.data[i][j]=0;
					for(int k=0;k<mat1.col;k++)
					{
						mult.data[i][j]=mult.data[i][j]+mat1.data[i][k]*mat2.data[k][j];
					}
				}
			}
		}
		return mult;
	}
	
	public static void main(String[] args)
	{
		Matrix matrix = new Matrix(3,3);
		int[][] values = {{1,2,3},{3,4,5},{5,6,7}};
		matrix.getMatrix(values, matrix);
		
		System.out.println("given matrix is:");
		matrix.show(matrix);
		matrix.transpose(matrix);
		System.out.println("Transposed matrix :");
		matrix.show(matrix);
		Matrix matrix1 = new Matrix(3,3);
		int[][] values1 = {{1,0,0},{0,1,0},{0,0,1}};
		matrix1.getMatrix(values1, matrix1);
		Matrix multiplication = matrix1.multiply(matrix,matrix1);
		System.out.println(" matrix multiplication :");
		multiplication.show(multiplication);
		
	}
}
