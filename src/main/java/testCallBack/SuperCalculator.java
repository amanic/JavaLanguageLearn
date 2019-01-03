package testCallBack;

/**
 * 因此，超级计算器的add方法应该包含两个操作数和小明自身的引用，代码如下：
 */
public class SuperCalculator {
    public void add(int a, int b, Student3  xiaoming)
    {
        int result = a + b;
        xiaoming.fillBlank(a, b, result);
    }
}
