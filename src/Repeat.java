public class Repeat
{
    public static String repeat(String word, int kol)
    {
        String jeep = "";
        char[] str=word.toCharArray();
        for (int i=0; i<word.length(); i++)
            for (int j=0; j<kol; j++)
            {
                jeep += str[i];
            }
        return jeep;
    }
}
