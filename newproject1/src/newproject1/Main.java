package newproject1;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 5, 5, 11, 4, 5, 11, 13, 14, 15};
        HashMap<Integer ,Integer> m=new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++) {
        	if(!m.containsKey(arr[i])) 
   {
        		m.put(arr[i], 1);
        	}
        	else {
        		m.put(arr[i], m.get(arr[i])+1);
        	}
        }
        for(Map.Entry<Integer, Integer> e:m.entrySet()) {
        	System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}