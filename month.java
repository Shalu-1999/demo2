import java.io.*;
import java.util.*;
class Test{
public static void main(String args[]){
Scanner scr=new Scanner(System.in);
int inpVar=scr.nextInt();
System.out.println(Test.printmonth(inpVar));
}
public static String printmonth(int monthno){
String month;
switch(monthno){
case 0:{month="january";break;}
case 1:{month="february";break;}
case 2:{month="tueday";break;}
case 3:{day="wednesday";break;}
case 4:{day="thurday";break;}
case 5:{day="friday";break;}
case 6:{day="saturday";break;}
case 0:{month="january";break;}
case 0:{month="january";break;}
case 0:{month="january";break;}
case 0:{month="january";break;}
case 0:{month="january";break;}
case 0:{month="january";break;}
case 0:{month="january";break;}
case 0:{month="january";break;}
case 0:{month="january";break;}


default:day="INVALID";
}
//switch
return day;
}
}