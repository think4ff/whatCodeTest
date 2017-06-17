package test.code;

public class Ant2 {

    public static String getAntSeq(String inNum) {

        StringBuilder rv = new StringBuilder();

        for (int i = 0; i < inNum.length(); i++) {
            int reptCnt = 1;

            for (; i + 1 < inNum.length() && inNum.charAt(i) == inNum.charAt(i + 1); i++)
                reptCnt += 1;

            rv.append(inNum.charAt(i));
            rv.append(reptCnt);
        }
        return rv.toString();
    }

    public static String getVal(int loop) {
        String rv = "1";

        for (int i = 0; i < loop; i++)
            rv = getAntSeq(rv);

        return rv;
    }

    public static String getAntSeq2(String inNum, int loopNum) {
        StringBuilder rv = new StringBuilder();

        if (loopNum == 0)
            return inNum;

        for (int i = 0; i < inNum.length(); i++) {
            int reptCnt = 1;

            while (i + 1 < inNum.length() && inNum.charAt(i) == inNum.charAt(i + 1)) {
                reptCnt++;
                i++;
            }
            rv.append(inNum.charAt(i));
            rv.append(reptCnt);
        }
        loopNum--;
        // System.out.println("rv.toString()" + rv.toString());
        // System.out.println("loopNum" + loopNum);

        return getAntSeq2(rv.toString(), loopNum);
    }

    public static void main(String[] args) {

        // System.out.println(getVal(30));

        System.out.println("get2::" + getAntSeq2("1", 3));

        // System.out.println(getAntSeq("1"));
        // System.out.println(getAntSeq("11"));
         System.out.println(getAntSeq("12"));
        // System.out.println(getAntSeq("1121"));

    }

}
