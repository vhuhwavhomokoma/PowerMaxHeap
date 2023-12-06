import java.lang.*;
import java.util.Scanner;

public class testHeap{


public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter power value of 1 or 2:");
String user_input = sc.nextLine();


PowerMaxHeap mx = new PowerMaxHeap(1,8);

System.out.println("INSERTED TEST VALUES: 3,2,4,1,5,6,7");

if(user_input.equals("2")){
 mx = new PowerMaxHeap(2,8);

}




 mx.insert(3);
 mx.insert(2);
 mx.insert(4);
 mx.insert(1);
 mx.insert(5);
 mx.insert(6);
 mx.insert(7);
 
 
System.out.println("HEAP AFTER INSERTION");
int [] testheap = mx.getHeap();
for(int i = 0; i<testheap.length; i++){
 if(testheap[i]!=0){
  System.out.println(testheap[i]);
 }
 }
 
 
System.out.println("POP");
System.out.println(mx.popMax());
System.out.println("HEAP AFTER POP");

int [] testheap2 = mx.getHeap();
for(int i = 0; i<testheap2.length; i++){
 if(testheap2[i]!=0){
  System.out.println(testheap2[i]);
 }
 
}









}








}