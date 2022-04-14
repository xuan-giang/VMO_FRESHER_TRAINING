public class MyString {
    private String str;

    public MyString() {
    }

    public MyString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getSumASCIIOfCharacter()
    {
        int result = 0;

        for(int i = 0; i < str.length(); i++)
        {
            result += str.charAt(i);
        }

        return result;
    }

    public int getSumASCIIOfUpperCaseCharacter()
    {
        int result = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
            {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public int countCharacterInStr(char x, String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        return count;
    }

    public void countCharacterSameAmount(int n)
    {
        for(int i = 0; i < str.length(); i++)
        {

        }
    }
}
