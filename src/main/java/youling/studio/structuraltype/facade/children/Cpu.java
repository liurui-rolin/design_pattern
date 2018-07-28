package youling.studio.structuraltype.facade.children;

/**
 * @author liurui
 * @date 2018/7/28 下午2:23
 *
 * cpu子系统
 *
 */
public class Cpu implements Runnable,Stopable{

    @Override
    public void run() {
        System.out.println("cpu running");
    }

    @Override
    public void stop() {
        System.out.println("cpu stoped");
    }
}
