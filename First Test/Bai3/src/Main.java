public class Main {
    public static void main(String[] args) {
        //Ví dụ chuỗi: "abAbbaA"
        MyString myString = new MyString("abAbbaA");


        System.out.println("Tong bang ma ASCII = " + myString.getSumASCIIOfCharacter());
        System.out.println("Tong bang ma ASCII ky tu in hoa = " + myString.getSumASCIIOfUpperCaseCharacter());
        System.out.println("Test so lan xuat hien: " + myString.countCharacterInStr('b', myString.getStr()));
    }
}
