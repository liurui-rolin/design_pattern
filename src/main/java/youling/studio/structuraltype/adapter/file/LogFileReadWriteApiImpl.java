package youling.studio.structuraltype.adapter.file;

import java.io.*;

/**
 * @author liurui
 * @date 2018/7/28 下午4:37
 */
public class LogFileReadWriteApiImpl implements LogFileReadWriteApi {
    private String filedir = "/Users/ruiliu/Downloads/java_test.obj";

    @Override
    public void writeLog(LogModel data) {
        File file = new File(this.filedir);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            out.writeObject(data);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    @Override
    public LogModel readLog() {
        File file = new File(this.filedir);

        ObjectInputStream in = null;
        LogModel res = null;

        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            res = (LogModel) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        return res;
    }
}
