import java.util.HashSet;
import java.util.Scanner;

public class Main {
	final int n=50;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nSeq=sc.nextLine();//第一行为序列长度n(1 ≤ n ≤ 50)
		String nSeq2=sc.nextLine();//第二行为n个数 sequence[i](1 ≤ sequence[i] ≤ 1000)，以空格分隔
		
		//获取第二行的n个数序列 利用空格分割
		HashSet<Integer> mySet=new HashSet<>(); 
		String[] myStr=nSeq2.split(" ");//获得拆分后的新字符型数组
		for(int i=0;i<myStr.length;i++)
		{
			mySet.add(Integer.parseInt(myStr[i]));
		}
		
		for(int num:mySet)
		{System.out.print(num+" ");}
	}
}
