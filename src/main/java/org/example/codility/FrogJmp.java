package org.example.codility;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int step=(Y-X)/D;
        if(D*step+X<Y){
            step++;
        }
        return step;
    }
}
