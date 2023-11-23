import java.util.*;
public class jumble1{ 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t1 = sc.nextInt();
    int t2 = sc.nextInt();
    int m ;
    if(sc.hasNextInt()){
      m=sc.nextInt();
    }
    else{
      System.out.println("Invalid");
      return;
    }
    ArrayList <Integer> arr = new ArrayList<>();
    int i=1;
    while (true) {
      int temp = i*(2*i-1);
      if(temp>=t1 && temp<=t2){
        arr.add(temp);
      }
      else if(temp>t2){
        //no num
        break;
      }
      i++;

      
    }
    if(m<=arr.size()){
      System.out.println(arr.get(m-1));
    }
    else if(m>arr.size()){
      System.out.println("No number is found");
    }
    else{
      System.out.println("Invalid input");
    }
  }
}

