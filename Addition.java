import java.util.Scanner;
public class Addition{
public static void main(String [] args){
  Scanner sc =new Scanner (System.in);
  int a =sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  if(a>b && a>c && b>c){
  System.out.println("Your sum is" +(a+b));
  }
  if(a<b && a<c && b<c){
  System.out.println("Your sum is "+ (b+c));
  }
}
}