public class IsPrefixSuffix
{
    public static boolean isPrefix(String str1, String str2)
    {
        boolean bo = false;
        for (int i=0; i<str2.length()-1; i++)
        {
            for (int j=0; j < str2.length()-1; j++)
            {
                if (str1.charAt(i)==str2.charAt(j))
                {
                    bo = true;
                    i++;
                }
                else
                {
                    bo = false;
                    break;
                }
                break;
            }
        }
        return bo;
    }
    public static boolean isSuffix(String str1,String str2)
    {
        boolean bo = false;
        for (int j=str2.length()-1; j>0; j--)
        {
            for (int i=str1.length()-1; i>(str1.length()-str2.length()); i--)
            {
                if (str1.charAt(i)==str2.charAt(j))
                {
                    bo = true;
                    j--;
                }
                else
                {
                    bo = false;
                    break;
                }
            }
        }
        return bo;
    }
}
