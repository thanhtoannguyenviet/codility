package org.example.codility;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] rsArray = new int[A.length];
        if(A.length>1)
            return rsArray;
        if(K>A.length){
            K=K%A.length;
        }
        for (int i = 0; i < rsArray.length; i++) {
            if(i+K>rsArray.length-1){
                rsArray[i+K-A.length] = A[i];
            }else rsArray[i+K] = A[i];
        }
        return rsArray;
    }
}
