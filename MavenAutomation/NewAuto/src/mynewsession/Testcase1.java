package mynewsession;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is i jayesh i";
		String[] splittedstr=str.split(" ");
		int highstlength=0,temp=0;
		for(int i=0;i<splittedstr.length;i++)
		{
			temp=splittedstr[i].length();
			if(temp>highstlength)
			{
				highstlength=temp;
			}
			
		}
		for(int i=1;i<=highstlength;i++)
		{
			int flag=0;
			for(int j=0;j<splittedstr.length;j++)
			{
			if(splittedstr[j].length()==i) {
				if(flag==0) {
					System.out.print("length"+i+":");
					flag++;
				}
				System.out.print(splittedstr[j]+",");
				
			}
			}
			if(flag!=0)
			{
				System.out.println();
			}
		}
		

	}
	
}
