
public class uniqueArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int []ar=new int[s];
		int []arr=new int[];
		int index=0;
		for(int i=0;i<s;i++) {
			ar[i]=sc.nextInt();
		}
		for(int j=0;j,s-1;j++) {
			for(int x=j+1;x<s;x++) {
				if(ar[j]==ar[x]) {
					break;
				}
				else {
					arr[index]=ar[j];
					break;
				}
			}
			index++;
		}
	}

}
