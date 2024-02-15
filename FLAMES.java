import java.util.Scanner;

public class FLAMES {
	
	private static String[] relation= {"Friends","Lover","Affectionate","Marriage","Enemies","Siblings"}; 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your Name : ");
		String name1=scan.next().toLowerCase();

		System.out.print("Enter your Pantner Name : ");
		String name2=scan.next().toLowerCase();
		
		function(name1,name2);
		
		scan.close();
	}
	static void function(String str1,String str2) {
		int vlu=0;
		if(str1.length()>str2.length()) {
			vlu=loop(str1,str2);
		}else {
			vlu=loop(str2,str1);
		}
		
		if(vlu<=6) {
			display(vlu-1);
		}else {
			vlu=vlu%6;
			display(vlu-1);
		}

	}
	static int loop(String str1,String str2) { 
		int len1=str1.length();
		int count1=len1;
		int len2=str2.length();
		int count2=len2;
		char[] st1=str1.toCharArray();
		char[] st2=str2.toCharArray();
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(st1[i]==st2[j]) {
					st2[j]='@';
					count1=count1-1;
					count2=count2-1;
				}
			}
		}
		int result=count1+count2;
		return result;
	}
	
	static void display(int val) {
		System.out.println("Your Relationship Status : "+relation[val]);
	}
}
