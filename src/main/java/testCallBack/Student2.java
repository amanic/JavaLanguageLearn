package testCallBack;

/**
 * 第2章. 幼师的找茬
 *
 * 课间，幼师突发奇想在黑板上写了“168 + 291 = ”让小明完成，然后回办公室了。
 *
 * 花擦！为什么所有老师都跟小明过不去啊？明明超纲了好不好！这时候小明同学明显不能再像上面那样靠心算来完成了，正在懵逼的时候，
 * 班上的小红同学递过来一个只能计算加法的计算器（奸商啊）！！！！而小明同学恰好知道怎么用计算器，
 * 于是通过计算器计算得到结果并完成了填空。
 *
 * 该过程中仍未涉及到回调机制，但是部分小明的部分工作已经实现了转移，由计算器来协助实现。
 */
public class Student2 {
    private String name = null;

    public Student2(String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @SuppressWarnings("unused")
    private int calcADD(int a, int b)
    {
        return a + b;
    }

    private int useCalculator(int a, int b)
    {
        return new Calculator().add(a, b);
    }

    public void fillBlank(int a, int b)
    {
        int result = useCalculator(a, b);
        System.out.println(name + "使用计算器:" + a + " + " + b + " = " + result);
    }

    /**
     * 测试代码
     * @param args
     */
    public static void main(String[] args)
    {
        int a = 168;
        int b = 291;
        Student2 s = new Student2("小明");
        s.fillBlank(a, b);
    }
}
