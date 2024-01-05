import java.util.Scanner;
class Test{
public static void main(String args[])
{
Scanner scr=new Scanner(System.in);
char c=scr.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println("it is a vowel");
if(c>='0'&&c<='9')

System.out.println("it is a digit");
if(c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z')
System.out.println("it is a consonant");
if(c=='+'||c=='-'||c=='*')

System.out.println("it is a symbol");
}
}