import java.util.Scanner;
class IF_ELSE_example2
{
public static void main(String args[])
{
Scanner src=new Scanner(System.in);
int i=src.nextInt();
int j=src.nextInt();
if(j==0) System.out.println("Division by error");
else 
System.out.println(i+" divided by "+j+" is "+(i/j));
i = i+j;
}
}
