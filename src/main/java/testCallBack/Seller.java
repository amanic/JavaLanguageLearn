package testCallBack;

public class Seller {
    private String name = null;

    public Seller(String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public class doHomeWork implements DoJob
    {

        public void fillBlank(int a, int b, int result)
        {
            // TODO Auto-generated method stub
            System.out.println(name + "求助小红算账:" + a + " + " + b + " = " + result + "元");
        }

    }

    public void callHelp (int a, int b)
    {
        new SuperCalculator2().add(a, b, new doHomeWork());
    }

    public static void main(String[] args)
    {
        int a = 56;
        int b = 31;
        int c = 26497;
        int d = 11256;
        Student4 s1 = new Student4("小明");
        Seller s2 = new Seller("老婆婆");

        s1.callHelp(a, b);
        s2.callHelp(c, d);
    }
}
