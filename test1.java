import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scr=new Scanner(System.in);
char c=scr.next().charAt(0);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')|System.out.println("YES");
else
System.out.println("NO");
}
}