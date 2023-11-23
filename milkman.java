import java.util.*;
public class milkman{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int capacity= sc.nextInt();
    int count=0;
    int quotient = capacity/10;
    int rem = capacity%7;
    if((capacity%10)==0){
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
  
    
    
    


  

    


    


    



  }
}
