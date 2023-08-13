import java.util.*;

public class calculator{

public static void main(String[] args) {
    



     Scanner sc = new Scanner(System.in);



System.out.println("'enter two numbers"); 
int a= sc.nextInt();

int b =sc.nextInt();
System.out.println("Enter an operator you want to execute (+, -,x,/,)");
char ob= sc.next().charAt(0);
 switch(ob)

{

case '+': System.out.println(a+b);

break;

case'-': System.out.println(a-b);

break;

case '*': System.out.println(a*b);

break;

case'/':System.out.println(a/b); 
break;

default: System.out.println("Invalid option");
}
}
}