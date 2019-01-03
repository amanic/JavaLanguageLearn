package testCallBack;

/**
 * 因为灵感来自帮小明填空，因此小红保留了初心，把所有业务都当做填空（fillBlank）来做。
 *
 * 同时，小红修改了自己的计算器，使其可以同时处理不同的实现了doJob接口的人，代码如下：
 */
public class SuperCalculator2 {

    public void add(int a, int b, DoJob  customer)
    {
        int result = a + b;
        customer.fillBlank(a, b, result);
    }
}
