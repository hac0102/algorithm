public class Al08RecursionStringLengthCode01 {
    public static void main(String[] args){
        int stringLength = stringLength("문자열길이");

        printChars("문자열길이");
        System.out.println("문자열 길이 ::: " + stringLength);
    }

    private static void printChars(String str) {
        if(str.length() == 0){
            return;
        }else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    private static int stringLength(String str) {
        if("".equals(str)){
            return 0;
        }else{
            return 1 + stringLength(str.substring(1));
        }
    }
}
