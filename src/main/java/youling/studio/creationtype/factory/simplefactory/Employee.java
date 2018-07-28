package youling.studio.creationtype.factory.simplefactory;

/**
 * @author liurui
 * @date 2018/7/26 下午8:29
 *
 * 简单工厂本质:选择实现
 */
public class Employee {
    public static void main(String[] args) {
        Car car = CarFactory.createCar("bmw");
        car.driver();
    }
}
