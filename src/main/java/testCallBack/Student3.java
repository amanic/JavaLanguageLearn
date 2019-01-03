package testCallBack;

/**
 * 发现小明完成了3位数的加法，老师觉得小明很聪明，是个可塑之才。于是又在黑板上写下了“26549 + 16487 = ”，让小明上课之前完成填空，然后又回办公室了。
 *
 * 小明看着教室外面撒欢儿的小伙伴，不禁悲从中来。再不出去玩，这个课间就要废了啊！！！！ 看着小红再一次递上来的计算器，小明心生一计：让小红代劳。
 *
 * 小明告诉小红题目是“26549 + 16487 = ”，然后指出填写结果的具体位置，然后就出去快乐的玩耍了。
 *
 * 这里，不把小红单独实现出来，而是把这个只能算加法的计算器和小红看成一个整体，一个会算结果还会填空的超级计算器。这个超级计算器需要传的参数是两个加数和要填空的位置，而这些内容需要小明提前告知，
 *
 * 也就是小明要把自己的一部分方法暴漏给小红，最简单的方法就是把自己的引用和两个加数一块告诉小红。
 *
 * 小明这边现在已经不需要心算，也不需要使用计算器了，因此只需要有一个方法可以向小红寻求帮助就行了，代码如下：
 */
public class Student3 {
    private String name = null;

    public Student3(String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void callHelp (int a, int b)
    {
        new SuperCalculator().add(a, b, this);
    }

    public void fillBlank(int a, int b, int result)
    {
        System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
    }

    /**
     * 测试代码
     * @param args
     */
    public static void main(String[] args)
    {
        int a = 26549;
        int b = 16487;
        Student3 s = new Student3("小明");
        s.callHelp(a, b);
    }
}
