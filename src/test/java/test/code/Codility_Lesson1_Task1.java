package test.code;

public class Codility_Lesson1_Task1 {

    public static void main(String[] args) {
        
        System.out.println(Integer.toBinaryString(1041) + " / " + solution(1041));
        System.out.println(Integer.toBinaryString(1024) + " / " + solution(1024));
        System.out.println(Integer.toBinaryString(16)   + " / " + solution(16));
        System.out.println(Integer.toBinaryString(51712) + " / " + solution(51712));
        
    }
    
    public static int solution(int N) { 
        
        String strb = Integer.toString(N, 2);
        char[] strChs = strb.toCharArray();
        
        int firstTmp = 0;
        int retVal = 0;
        int prevVal = 0;
        
        for(int i=0; i<strChs.length; i++) {
            
//            if((i > 0 && strChs[i-1] == '1' && strChs[i] == '1')) {
//                firstTmp = i;
//            }
            
            if (i > 0 && strChs[i-1] == '0' && strChs[i] == '1') {
                retVal = (i - firstTmp) - 1;
                firstTmp = i;
                
                if(prevVal > retVal)
                    retVal = prevVal;
            }
            prevVal = retVal;
            
            if(strChs[i] == '1') {
                firstTmp = i;
            } 
        }

        return retVal; 
    }
    

}
