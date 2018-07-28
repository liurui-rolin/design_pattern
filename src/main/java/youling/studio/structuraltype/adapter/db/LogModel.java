package youling.studio.structuraltype.adapter.db;

/**
 * @author liurui
 * @date 2018/7/28 下午5:15
 */
public class LogModel {
    private String id = "";
    private String data = "";

    public LogModel(String id, String data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LogModel{" +
                "id='" + id + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
