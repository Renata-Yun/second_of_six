public class BoxSeq
{
    public static int boxSeq(int shag)
    {
        int sup = 0;
        while (shag>0)
        {
            if (shag % 2 != 0 && shag > 2)
            {
                for (int i = 1; i <= shag; i++)
                {
                    sup += 3;
                    sup -= 1;
                    shag -= 2;
                }
            }
            else if (shag % 2 == 0)
            {
                for (int i = 1; i <= shag; i++)
                {
                    sup += 3;
                    sup -= 1;
                    shag -= 2;
                }
            }
            else if (shag == 1)
            {
                sup += 3;
                shag -= 1;
            }
        }
        return sup;
    }
}
