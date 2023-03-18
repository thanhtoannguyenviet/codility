package org.example;

import org.example.codility.BinaryGap;
import org.example.codility.CyclicRotation;

public class Main {
    public static void main(String[] args) {
        int[] A =  {1, 2, 3, 4};
        int K = 4;
        CyclicRotation cyclicRotation = new CyclicRotation();
        for (int i = 0; i < A.length; i++) {
            System.out.println(cyclicRotation.solution(A,K)[i]);
        }
    }

}