package youling.studio.creationtype.factory.simplefactory;

/**
 * @author liurui
 * @date 2018/7/26 下午8:29
 */
public class CarFactory {
    private CarFactory(){}

    public static Car createCar(String type){
        Car car = null;

        if("bmw".equals(type)){
            car = new BmwCar();
        }else if("bz".equals(type)){
            car = new BzCar();
        }else{
            System.out.println("没有该产品生产功能!");
        }

        return car;
    }
}
