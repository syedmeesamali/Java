public class AsapJobsClass
{
    public static void main(String[] args) {
        System.out.println(test());
    }
    static int test() //Won't compile if not made static
    {
        int var = 100;
        return ++var;
    }
} //End of overall class file

