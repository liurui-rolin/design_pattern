package youling.studio.structuraltype.adapter.file;

/**
 * @author liurui
 * @date 2018/7/28 下午5:07
 */
public class Client {
    public static void main(String[] args) {
        LogFileReadWriteApi log = new LogFileReadWriteApiImpl();

        log.writeLog(new LogModel("1","data1"));

        System.out.println(log.readLog());

    }

}
