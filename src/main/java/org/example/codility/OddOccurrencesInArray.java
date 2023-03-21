package org.example.codility;

import java.util.HashMap;

public class OddOccurrencesInArray {
    public int solution(int[] A){
        HashMap<Integer,Integer> rsMap = new HashMap<>();
        int i = 0;
        while (i<A.length){
            if(rsMap.get(A[i])==null){
                rsMap.put(A[i],1);
            }else rsMap.put(A[i],rsMap.get(A[i])+1);
            i++;
        }
        for (Integer item : rsMap.keySet()
             ) {
            if(rsMap.get(item)%2==1)
                return item;
        }
        return 0;
    }
}
