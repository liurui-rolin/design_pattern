package youling.studio.structuraltype.adapter.file;

/**
 * @author liurui
 * @date 2018/7/28 下午4:32
 */
public interface LogFileReadWriteApi {
    public void writeLog(LogModel data);
    public LogModel readLog();
}
