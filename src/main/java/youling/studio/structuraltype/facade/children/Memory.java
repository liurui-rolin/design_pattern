package youling.studio.structuraltype.facade.children;

/**
 * @author liurui
 * @date 2018/7/28 下午2:23
 * 内存子系统
 *
 */
public class Memory implements Runnable,Stopable{

    @Override
    public void run() {
        System.out.println("memory running");
    }

    @Override
    public void stop() {
        System.out.println("memory stoped");
    }
}
