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
	}
}
