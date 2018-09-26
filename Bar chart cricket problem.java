import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class OrderByValue {
 
    public static void main(String args[]){
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner scan = new Scanner(System.in);
        int a,b,y,h;
        System.out.println("enter the number of overs..");
        int input = scan.nextInt();
        for (int i=0;i<input;i++){
            a=scan.nextInt();
            b=scan.nextInt();
            map.put(a, b);
        }
        
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        
        LinkedHashMap<Integer, Integer> mapA = 
                       new LinkedHashMap<Integer, Integer>();

       for(Map.Entry<Integer, Integer> entry:list){
           
            
            mapA.put(entry.getKey(), entry.getValue());
            
        }
        System.out.println(mapA);
       int  n=mapA.size();
        ArrayList<Integer> arr = new ArrayList<Integer>(n); 
        
        Object myKey = mapA.keySet().toArray()[0];// receive the first key
        Object c = mapA.get(myKey);//then receive the first value with respect to key
       
        int d = (Integer) c;
        
        
            
            for (int j=0;j<mapA.size()-1;j++){
                Object key1 = mapA.keySet().toArray()[j];// receive the first key
                Object t = mapA.get(key1);
                int e = (Integer) t;
                Object key2 = mapA.keySet().toArray()[j+1];// receive the first key
                Object tt = mapA.get(key2);
                int f = (Integer) tt;
                int k1 = (Integer) key1;
                int k2 = (Integer) key2;
                if(e == f){
                    arr.add(k1);
                    arr.add(k2);
                    j++;
                }
                else{
                    arr.add(k1);
                }
               
                Collections.sort(arr);
                 y=Collections.max(arr);
               
                 h=0;
                    for(int p=0;p<=y;p++){
                        if(p==arr.get(h)){
                           
                            System.out.print("."+p+".");
                            
                            h++;
                        }
                        
                        else
                        System.out.print("   ");
                        
                    }
                    
                
                System.out.println("");
                
            }
            
                Object key3 = mapA.keySet().toArray()[mapA.size()-1];// receive the first key
                
                int k3 = (Integer) key3;
                arr.add(k3);
                Collections.sort(arr);
       
      y=Collections.max(arr);
      for(int i=d;i>=1;i--){
           h=0;
                    for(int p=0;p<=y;p++){
                        if(p==arr.get(h)){
                         
                            System.out.print("."+p+".");
                           
                            h++;
                        }
                        
                        else
                        System.out.print("   ");
                        
                    }
                    
                
                System.out.println("");
          
      }
        
        
        
        
        
        
        
        
        
    }
}
