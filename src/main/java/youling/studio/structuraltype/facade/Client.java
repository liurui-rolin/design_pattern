package youling.studio.structuraltype.facade;

import youling.studio.structuraltype.facade.facade.Computer;

/**
 * @author liurui
 * @date 2018/7/28 下午2:36
 *
 * 外观模式 - 客户端
 * 外观模式目的:减少外部与子系统的多个模块交互,使外部更简单的使用子系统,松散耦合
 * 本质:封装交互,简化调用
 *
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        Computer computer = new Computer();
        computer.runComputer();
        Thread.sleep(1000*2);
        computer.shutdownComputer();
    }

}
