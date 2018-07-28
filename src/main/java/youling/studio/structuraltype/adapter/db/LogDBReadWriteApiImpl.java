package youling.studio.structuraltype.adapter.db;

/**
 * @author liurui
 * @date 2018/7/28 下午5:12
 */
public class LogDBReadWriteApiImpl implements LogDBReadWriteApi {
    @Override
    public void add(LogModel model) {
        System.out.println("add");
    }

    @Override
    public void update(LogModel modle) {
        System.out.println("update");
    }

    @Override
    public LogModel findAll() {
        System.out.println("find");
        return null;
    }

    @Override
    public void delete(String id) {
        System.out.println("delete");
    }
}
