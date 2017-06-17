package test.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Rakuten_Test01 {

    public static void main(String[] args) {

        Rakuten_Test01 test = new Rakuten_Test01();

        int a1 = 1213;
        System.out.println("a1::" + test.solution(a1));

        int a2 = 1000;
        System.out.println("a2::" + test.solution(a2));
        
        int a3 = 1001;
        System.out.println("a3::" + test.solution(a3));

    }

    public int solution(int inVal) {
        
        int retVal = 0;
        String inStr = Integer.toString(inVal);
        char[] numArrs = inStr.toCharArray();
        
        Arrays.sort(numArrs);
        int inArrsLen = numArrs.length;
        char[] minArrs = new char[inArrsLen];
        System.arraycopy(numArrs, 0, minArrs, 0, inArrsLen);
        int minNum1st = Integer.parseInt(new String(minArrs));
        int minNums = minNum1st;
        
        if(minNum1st == 1)
            return ++retVal;

        List<Character> maxCharList = new ArrayList<Character>();
        for(char c : numArrs)
            maxCharList.add(c);
        Collections.reverse(maxCharList);
        
        String s = maxCharList.stream().map(Object::toString).collect(Collectors.joining());
        int maxNums = Integer.parseInt(s);
        
        System.out.println("min:" + minNums);
        System.out.println("max:" + maxNums);
        
        while(minNums <= maxNums) {
            int compNum = minNums;
            char[] compChars = Integer.toString(compNum).toCharArray();
            Arrays.sort(compChars); 
            int compMinNums = Integer.parseInt(new String(compChars));

            //minNums를 sorting해서 int로 변환하면 minNum1st값과 항상 동일하다.
            //앞에 0가 붙는 것은 제외 (ex. 0011, 0110)
            if(minNum1st == compMinNums && compChars.length == inArrsLen) {
                System.out.println("minNums:" + minNums);
                retVal++;
            }
            minNums++;
        }
        return retVal;
    }
    
    
    public static void reverseArrayChar(char[] array) {
        char temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
    }
}
