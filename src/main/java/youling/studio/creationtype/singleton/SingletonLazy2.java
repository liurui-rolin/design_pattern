package youling.studio.creationtype.singleton;

/**
 * @author liurui
 * @date 2018/8/11 下午6:02
 * 懒饿汉式实现单例
 */
public class SingletonLazy2 {
    //私有化构造方法
    private SingletonLazy2(){}

    //此处使用volatile修饰,保证ins对象对于所有线程的可见性,多线程的时候,各个线程读的内容是线程自己缓存的信息
    private static volatile SingletonLazy2 ins = null;

    public static SingletonLazy2 getInstance(){
        //双重判断加锁实现初始化的线程安全
        if(ins==null){
            synchronized (SingletonLazy2.class){
                if(ins==null){
                    ins = new SingletonLazy2();
                }
            }
        }
        return ins;
    }
    
}
