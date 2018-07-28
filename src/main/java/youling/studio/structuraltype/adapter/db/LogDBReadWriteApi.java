package youling.studio.structuraltype.adapter.db;

/**
 * @author liurui
 * @date 2018/7/28 下午5:12
 */
public interface LogDBReadWriteApi {
    public void add(LogModel model);
    public void update(LogModel modle);
    public LogModel findAll();
    public void delete(String id);
}
