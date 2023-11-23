import java.util.*;
public class milk{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int capacity= sc.nextInt();
    int count=0;
    int quotient = capacity/10;
    int rem = capacity%10;
    if((rem)==0){
      count+=quotient;
    }
    else{
      if((rem%7)==0){
        count+=(quotient)+(rem/7);
      }else{
        if((rem%5)==0){
          count+=(quotient)+(rem/7)+(rem/5);
        }else{
          if((rem%1)==0){
            count+=(quotient)+(rem/7)+(rem/5)+(rem/1);
          }
        }
      }
    }
    System.out.println(count);
  }
}
  
    
    