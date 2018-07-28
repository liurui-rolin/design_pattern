package youling.studio.structuraltype.adapter.adapter;

import youling.studio.structuraltype.adapter.db.LogDBReadWriteApi;
import youling.studio.structuraltype.adapter.db.LogModel;
import youling.studio.structuraltype.adapter.file.LogFileReadWriteApi;
import youling.studio.structuraltype.adapter.file.LogFileReadWriteApiImpl;

/**
 * @author liurui
 * @date 2018/7/28 下午5:20
 */
public class DB2FileAdapter implements LogDBReadWriteApi {
    private LogFileReadWriteApi log = new LogFileReadWriteApiImpl();

    public DB2FileAdapter(LogFileReadWriteApi log) {
        this.log = log;
    }

    @Override
    public void add(LogModel model) {
        log.writeLog(new youling.studio.structuraltype.adapter.file.LogModel(model.getId(),model.getData()));
    }

    @Override
    public void update(LogModel modle) {

    }

    @Override
    public LogModel findAll() {
        youling.studio.structuraltype.adapter.file.LogModel logModelOld = this.log.readLog();
        return new LogModel(logModelOld.getId(),logModelOld.getData());
    }

    @Override
    public void delete(String id) {

    }
}
