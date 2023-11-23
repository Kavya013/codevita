import java.util.*;
public class swayamvaram{
  public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    String brides= sc.next();
    String grooms= sc.next();
    char[] b = brides.toCharArray();
    char[] g= grooms.toCharArray();
    StringBuilder sb = new StringBuilder(brides);
    StringBuilder sb1 = new StringBuilder(grooms);

    for(int i=0;i<n;i++){
        if(b[i]==g[i]){
          sb.deleteCharAt(i);
          sb1.deleteCharAt(i);
        }
        else if(b[i]!=g[i]){
          for(int j=0;j<n-1;j++){
            g[j]=g[j+1];
          }
          g[n-1]=g[i]; 
        }
        else{
          break;
        }



      

        }
        System.out.println(sb.length());
      }
    

    
  
   
    


     

    






  }
