package _String;

public class m_array_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a1 = {{1,2},{2,4}};
		int[][] a2 = {{3,4},{5,6}};
		int[][] a3 = new int[2][2];
		
		for(int i=0; i<a1.length;i++)
		{
			for(int j=0; j<a2.length;j++)
			{
				a3[i][j] = a1[i][j]+a2[i][j];
			}
		}
		
		for(int i=0; i<a1.length;i++)
		{
			for(int j=0; j<a2.length;j++)
			{
				System.out.print(a3[i][j]+" ");	;
			}
			System.out.println();
		}
	}

}
