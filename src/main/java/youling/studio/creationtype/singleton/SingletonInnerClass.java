package youling.studio.creationtype.singleton;

/**
 * @author liurui
 * @date 2018/8/11 下午6:02
 * 通过lazy initialization holder class实现单例
 */
public class SingletonInnerClass {
    //私有化构造方法
    private SingletonInnerClass(){}

    private static class SingletonInnerClassHolder{
        //借助jvm类加载机制实现初始化,保证线程安全
        private static SingletonInnerClass ins = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance(){
        return SingletonInnerClassHolder.ins;
    }

}
