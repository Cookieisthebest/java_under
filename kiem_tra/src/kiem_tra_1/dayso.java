package kiem_tra_cuc;
import java.util.ArrayList;
import java.util.Collections;

public class dayso {
     private ArrayList<Integer> day = new ArrayList<>();
     dayso()
     {
         
     }
     dayso(ArrayList<Integer> day)
     {
         this.day = day;
     }
     public void nhonhat()
     {
         ArrayList<Integer> arr1 = new ArrayList<>(day);
         Collections.sort(arr1);
         System.out.println(arr1.get(0));
     }
     public void sapxep()
     {
         ArrayList<Integer> arr2 = new ArrayList<>(day);
         Collections.sort(arr2,Collections.reverseOrder());
         for(int i = 0 ; i < arr2.size();i++)
         {
             System.out.print(arr2.get(i)+" ");
         }
         System.out.println("");
     }
    
}