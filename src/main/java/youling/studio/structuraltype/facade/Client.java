package youling.studio.structuraltype.facade;

import youling.studio.structuraltype.facade.facade.Computer;

/**
 * @author liurui
 * @date 2018/7/28 下午2:36
 *
 * 外观模式 - 客户端
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
