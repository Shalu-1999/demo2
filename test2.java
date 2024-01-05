import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scr=new Scanner(System.in);
char c=scr.next().charAt(0);
if(c>='0'&&c<='9')
System.out.println("YES");
else
System.out.println("NO");
}
}