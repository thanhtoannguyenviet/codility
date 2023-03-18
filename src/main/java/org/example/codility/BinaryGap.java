package org.example.codility;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap{
    //86: Need check carefull gap like 1001000 -> got 3 expect 2
    public int solution(int N) {
        String strResult = "";
        while (N!=0){
            if(N%2==1){
                strResult ="1"+strResult;
            }else strResult ="0"+strResult;
            N=N/2;
        }
        int maxLength = 0;
        String[] strArray = strResult.split("1");
        if(strResult.split("0").length>1){
            for (String item : strResult.split("1")){
                if(item.length()> maxLength)
                    maxLength = item.length();
            }
        }
        return maxLength;
    }
    //93
    public int bsolution(int N) {
        String strResult = "";
        while (N!=0){
            if(N%2==1){
                strResult ="1"+strResult;
            }else strResult ="0"+strResult;
            N=N/2;
        }
        int maxLength = 0;
        int flagNum = 0;
        int validateNum1 = 0;
        for (char c : strResult.toCharArray()){
            if(flagNum != 0 && maxLength < flagNum){
                maxLength=flagNum;
            }
            flagNum=(c=='1')?0:flagNum++;
            if(c == '1'){
                flagNum=0;
                validateNum1++;
            } else {
                flagNum++;
            }
        }
        if(validateNum1 <2){
            maxLength=0;
        }
        return maxLength;
    }
    //100
    public int csolution(int N) {
        String strResult = "";
        while (N!=0){
            if(N%2==1){
                strResult ="1"+strResult;
            }else strResult ="0"+strResult;
            N=N/2;
        }
        int maxLength = 0;
        int flagNum = 0;
        boolean flagValidate = false;
        for (char c : strResult.toCharArray()){
            if (c=='1'){
                flagValidate = !flagValidate;
            }else if(c=='0'){
                flagNum++;
            }
            if(flagValidate==false){
                flagValidate=true;
                if(flagNum>maxLength){
                    maxLength=flagNum;
                }
                flagNum=0;
            }
        }
        return maxLength;
    }
    //MinDistinct -> use for Interview
}
