package _String;

public class m_first_index_last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		arr[8] = 1;
		arr[9] = 9;
		arr[4] = 12;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				System.out.println("First Index: "+ i);
				break;
			}
			
			arr[i]=0;
		}
		
		
		System.out.println("2nd program...");
		
		
		for(int i=arr.length-1; i>=0; i++)
		{
			if(arr[i]!=0)
			{
				System.out.println("last Index: "+ i);
				break;
			}
			
			arr[i]=0;
		}
		
	}

}
