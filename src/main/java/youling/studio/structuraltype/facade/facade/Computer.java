package youling.studio.structuraltype.facade.facade;

import youling.studio.structuraltype.facade.children.Cpu;
import youling.studio.structuraltype.facade.children.Disk;
import youling.studio.structuraltype.facade.children.Memory;

/**
 * @author liurui
 * @date 2018/7/28 下午2:31
 *
 * 门面类
 *
 */
public class Computer {

    private Cpu cpu ;
    private Disk disk ;
    private Memory memory ;

    public Computer(){
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void runComputer(){
        System.out.println("启动计算机");
        this.cpu.run();
        this.disk.run();
        this.memory.run();
    }

    public void shutdownComputer(){
        System.out.println("关闭计算机");
        this.cpu.stop();
        this.disk.stop();
        this.memory.stop();
    }
}
