package test.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Codility_Lesson6_Task1 {

    public static void main(String[] args) {

        int[] input1 = { 2, 1, 1, 2, 3, 1 };
        System.out.println("input1:" + " : " + solution(input1));
        System.out.println("input2:" + " : " + solution2(input1));

        lambdaTest();
    }

    public static int solution(int[] inArr) {

        int retVal = 0;
        int inLen = inArr.length;

        HashSet<Integer> uniqSet = new HashSet<Integer>();

        for (int i = 0; i < inLen; i++) {
            if (uniqSet.add(inArr[i]))
                retVal++;
        }

        return retVal;
    }

    public static int solution2(int[] inArr) {

        int retVal = 0;

        List<Integer> inList = Arrays.stream(inArr).boxed().collect(Collectors.toList());  
        retVal = (int) inList.stream().distinct().count();
//        System.out.println(inList.stream().count());

        return retVal;
    }

    public static void lambdaTest() {
        List<String> words = Arrays.asList("hello", "cool", "Java8", "world!");

//        List<Integer> lengths = words.stream().map(String::length).distinct().collect(Collectors.toList());
        List<Integer> lengths = words.stream().map(s -> s.length()).distinct().collect(Collectors.toList());
        long outLen = words.stream().map(s -> s.length()).distinct().count();
        
        System.out.println("outLen::" + outLen);
        
        for(int aa : lengths) {
            System.out.println(aa);
        }
        
    }

}
