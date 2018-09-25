package strategy;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/25
 * Time: 9:29
 * To change this template use File | Settings | File Templates.
 * Description: 打8折策略类
 */
public class Discount8Strategy extends AbstractStrategy {

    @Override
    public double algorithmInterface(double totalPrice) {
        return totalPrice * 0.8;
    }
}
