package youling.studio.structuraltype.facade.children;

/**
 * @author liurui
 * @date 2018/7/28 下午2:23
 *
 * 磁盘子系统
 *
 */
public class Disk implements Runnable,Stopable{

    @Override
    public void run() {
        System.out.println("disk running");
    }

    @Override
    public void stop() {
        System.out.println("disk stoped");
    }
}
