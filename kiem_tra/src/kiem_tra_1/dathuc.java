package kiem_tra_cuc;
import java.util.Scanner;

public class dathuc {
    private int[] a;
    dathuc(){
        
    }
    public int getphantu(){
        return a.length;
    }
    
   public int[] mangdathuc()
   {
       return a;
   }
   public void input()
   {
       Scanner sc = new Scanner(System.in);
       for(int i = 0; i < getphantu();i++)
       {
           a[i] = sc.nextInt();
       }
   }
   
   public dathuc(int n)
   {
       a = new int[n];
   }
   
   public dathuc tonghaidathuc(dathuc other){
       int maxphantu = Math.max(this.getphantu(),other.getphantu() );
       dathuc m3 = new dathuc(maxphantu);
       int[] x = m3.mangdathuc();
       for(int i = 0; i < maxphantu ; i++)
       {
           x[i] = this.mangdathuc()[i] + other.mangdathuc()[i];
       }
       return m3;
   }
    
    

}