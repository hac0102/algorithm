public class Al09RecursionStringReverseCode01 {
    public static void main(String[] args){
        
        printCharReverse("문자열 뒤집기");
        
    }

    private static void printCharReverse(String str) {
        if(str.length() == 0){
            return;
        }else{
            printCharReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }

    }

}
