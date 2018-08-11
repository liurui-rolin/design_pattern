package youling.studio.creationtype.singleton;

/**
 * @author liurui
 * @date 2018/8/11 下午6:02
 * 懒饿汉式实现单例
 */
public class SingletonLazy {
    //私有化构造方法
    private SingletonLazy(){}

    //暂时不初始化
    private static SingletonLazy ins = null;

    //方法级别的锁实现初始化的线程安全
    public static synchronized SingletonLazy getInstance(){
        if(ins==null){
            ins = new SingletonLazy();
        }
        return ins;
    }

}
