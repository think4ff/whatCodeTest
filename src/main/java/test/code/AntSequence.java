package test.code;

public class AntSequence {

    public static String goAnt(int n) {
        String rs = "1";
        for (int i = 1; i < n; i++) {
            rs = goCheck(rs);
        }
        return rs;
    }

    public static String goCheck(final String inNum) {
        StringBuilder rvTotStr = new StringBuilder();
        int inNumLen = inNum.length();
        for (int i = 0; i < inNumLen; i++) {
            int reptCnt = 1;
            char checkedNum = inNum.charAt(i);
            for (; i + 1 < inNumLen && inNum.charAt(i) == inNum.charAt(i + 1); i++) {
                reptCnt++;
                // System.out.println("1___ reptCnt::" + reptCnt);
                // System.out.println("2___ rvTotStr::" + rvTotStr.toString());
            }
            rvTotStr.append(checkedNum);
            rvTotStr.append(reptCnt);

//            System.out.println("2___ rvTotStr::" + rvTotStr.toString());
        }
        return rvTotStr.toString();
    }
}
