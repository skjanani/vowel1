package janani;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		int count=0;
		String str;
		Scanner ja=new Scanner(System.in);
		System.out.println("enter the alpabets");
		str=ja.nextLine();
		int l=str.length();
		for(int i=0;i<l;i++){
			//c=charAt(i);
			if(str.substring(i,i+1).equalsIgnoreCase("a")||str.substring(i,i+1).equalsIgnoreCase("e")||str.substring(i,i+1).equalsIgnoreCase("i")||str.substring(i,i+1).equalsIgnoreCase("o")||str.substring(i,i+1).equalsIgnoreCase("u")){
				count=1;
			}
		}
		if(count==1){
			System.out.println("vowel");
		}
		else{
			System.out.println("not vowel");
		}
	
}
	}

