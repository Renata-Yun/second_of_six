public class IsValid
{
    public static boolean isValid(String Pochta)
    {
        boolean bo = true;
        if (Pochta.length()==5)
        {
            for (int i=0; i<Pochta.length(); i++)
            {
                if ((Pochta.charAt(i)==' ') || (!Character.isDigit(Pochta.charAt(i))))
                {
                    bo = false;
                    break;
                }
            }
        }
        else
            bo = false;
        return bo;
    }
}
