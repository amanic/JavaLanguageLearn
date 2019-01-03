package testCallBack;

/**
 * 小明和老婆婆拿到这个接口之后，只要实现了这个接口，就相当于按照统一的模式告诉小红得到结果之后的处理办法，按照之前说的使用内部类来做，代码如下：
 * 小明
 */
public class Student4 {
    private String name = null;

    public Student4(String name)
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
            System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
        }

    }

    public void callHelp (int a, int b)
    {
        new SuperCalculator2().add(a, b, new doHomeWork());
    }
}
