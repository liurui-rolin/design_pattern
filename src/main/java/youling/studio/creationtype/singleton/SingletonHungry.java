package youling.studio.creationtype.singleton;

/**
 * @author liurui
 * @date 2018/8/11 下午6:02
 * 饿汉式实现单例
 *
 * 单利本质:控制实例数量
 *
 */
public class SingletonHungry {
    //私有化构造方法
    private SingletonHungry(){}

    //借助jvm类加载机制实现初始化,保证线程安全
    private static SingletonHungry ins = new SingletonHungry();

    public static SingletonHungry getInstance(){
        return ins;
    }

}
