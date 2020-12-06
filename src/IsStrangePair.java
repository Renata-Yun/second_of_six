public class IsStrangePair
{
    public static boolean isStrangePair(String str1, String str2)
    {
        boolean bo = false;
        int i = str2.length()-1;
        int j = str1.length()-1;
        if (str1.charAt(0)==str2.charAt(i) && str2.charAt(0)==str1.charAt(j))
        {
            bo = true;
        }
        return bo;
    }
}
