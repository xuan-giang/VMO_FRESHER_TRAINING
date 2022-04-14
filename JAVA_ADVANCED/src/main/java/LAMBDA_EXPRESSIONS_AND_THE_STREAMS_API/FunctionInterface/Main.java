package LAMBDA_EXPRESSIONS_AND_THE_STREAMS_API.FunctionInterface;

public class Main {
    public static void main(String[] args) {
        FuncInterFace str1 = (a1) -> a1 + "?";
        FuncInterFace str2 = (a2) -> a2 + "!";

        printFormatString("Hello", str1);
        printFormatString("Hi", str2);
    }

    static void printFormatString(String str, FuncInterFace format){
        System.out.println(format.run(str));
    }
}
