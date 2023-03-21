package org.example.codility;

public class PermMissingElem {
    public int solution(int[] A) {
       if(A.length>2){
           int rs = 0;
           int aveNum = 0;
           long lengthNum = A.length;
           int min = A[0];
           int max = A[0];
           int sum = A[0];
           for (int i = 1; i<A.length;i++){
               if(min>A[i]){
                   min = A[i];
               }
               if(max<A[i]){
                   max = A[i];
               }
               sum+=A[i];
           }
           if(lengthNum%2!=1){
               aveNum = (min+max)/2;
               lengthNum = lengthNum/2;
           }else lengthNum = lengthNum/2+1;
           rs = (int) (((min+max)*lengthNum)+aveNum-sum);
           return rs;
       }else if (A.length==1){
           return A[0]+1;
        }
       else return 1;
    }
}
