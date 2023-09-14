package gurusir;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Questionnumber1 {
	public static void randomPersonName()    {
		String[] firstNames= {"Kavita","Suresh","Debarati","Ankita","Karthik"};//5  
		String[] lastNames= {"Hiremath","Anand","Jana","Patnaik","Vempalli"};//5   
		Set<String> generateNames=new HashSet<>();        
		Random rd=new Random();  
		int range=20;                
		for(int i=0;i<range;i++)        {            
			String fName=firstNames[rd.nextInt(firstNames.length)];//firstNames[4] 
			String lName=lastNames[rd.nextInt(lastNames.length)];//
			String fullName=fName+" "+lName; 
			System.out.println(fullName);  
			if(generateNames.contains(fullName)) 
			{               
				System.out.println("Duplicates :"+fullName);  
			}else         
			{                generateNames.add(fullName);  
			}  

		}           
	}


	public static void main(String[] args) {
		randomPersonName();

	}

}
