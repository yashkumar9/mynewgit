package forlooponly;

public class First1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i am a sowftware engineer employ ";
		String[] str2=str.split(" ");
		int hl=0;
		for(int i=0;i<=str2.length-1;i++)
		{
			if(str2[i].length()>hl)
			{
				hl=str2[i].length();
			}
		}
		//System.out.println(hl);
		for(int i=1;i<=hl;i++)
		{
			int flag=0;
			for(int j=0;j<=str2.length-1;j++)
			{
				//int flag=0;
				if(str2[j].length()==i ) {
					if(flag==0) {
					flag++;
					}
				System.out.print(str2[j]+" ");
				}
			}
			if(flag!=0) {
			System.out.println();
			}
		}
		//System.out.println();


	}

}
