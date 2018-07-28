package youling.studio.structuraltype.adapter.db;

/**
 * @author liurui
 * @date 2018/7/28 下午5:07
 */
public class Client {
    public static void main(String[] args) {
        LogDBReadWriteApi log = new LogDBReadWriteApiImpl();

        log.add(new LogModel("1","data1"));

        System.out.println(log.findAll());

    }

}
