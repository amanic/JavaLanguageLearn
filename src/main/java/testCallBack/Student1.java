package testCallBack;

/**
 * 第1章. 故事的缘起
 *
 * 幼师在黑板上写一个式子 “1 + 1 = ”，由小明同学来填空。
 *
 * 由于已经学习了10以内的加法，小明同学可以完全靠自己来计算这个题目，模拟该过程的代码如下：
 * 该过程完全由Student类的实例对象单独完成，并未涉及回调机制。
 */
public class Student1 {
    private String name = null;

    public Student1(String name)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private int calcADD(int a, int b)
    {
        return a + b;
    }

    /**
     * 小明同学在填空(fillBalnk)的时候，直接心算(clacADD)了一下，得出结果是2，并将结果写在空格里。
     * @param a
     * @param b
     */
    public void fillBlank(int a, int b)
    {
        int result = calcADD(a, b);
        System.out.println(name + "心算:" + a + " + " + b + " = " + result);
    }

    /**
     * 测试代码
     * @param args
     */
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        Student1 s = new Student1("小明");
        s.fillBlank(a, b);
    }
}
