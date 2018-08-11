package youling.studio.creationtype.singleton;

/**
 * @author liurui
 * @date 2018/8/11 下午6:33
 * 使用枚举实现单例模式
 */
public enum SingletonEnum {
    ins; //jvm本身能保证枚举的同一个类型只被创建一次

    public SingletonEnum getInstance(){
        return SingletonEnum.ins;
    }
}
