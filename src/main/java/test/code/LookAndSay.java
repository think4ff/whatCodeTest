package test.code;

public class LookAndSay {

    public static String lookAndSay(int loop) {
        String result = "1";
        
        for (int i = 1; i < loop; i++) {
            result = nextNumber(result);
        }
        return result;
    }

    private static String nextNumber(String inStr) {
        StringBuilder outStr = new StringBuilder();
        
        for (int i = 0; i < inStr.length(); i++) {
            int count = 1;
            while (i + 1 < inStr.length() && inStr.charAt(i) == inStr.charAt(i + 1)) {
                ++i;
                ++count;
            }
            outStr.append(inStr.charAt(i));
            outStr.append(count);
        }
        return outStr.toString();
    }

}
