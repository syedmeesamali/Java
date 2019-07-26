public class AsapJobsClass3
{
    public static void main(String[] args) {
        Test obj = new Test(15);
        System.out.println("Var = " + obj.var);
    }
} //End of overall class file

class Test
{
    public int var = 10;
    Test(int x)
    {
        var = x;
    }
}