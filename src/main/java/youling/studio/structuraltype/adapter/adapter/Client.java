package youling.studio.structuraltype.adapter.adapter;

import youling.studio.structuraltype.adapter.db.LogDBReadWriteApi;
import youling.studio.structuraltype.adapter.db.LogModel;
import youling.studio.structuraltype.adapter.file.LogFileReadWriteApi;
import youling.studio.structuraltype.adapter.file.LogFileReadWriteApiImpl;

/**
 * @author liurui
 * @date 2018/7/28 下午5:21
 *
 * 主要功能:转换匹配,复用已有的功能
 * 方式:对象组合实现,adaptee和target没有关系
 * 种类:
 *      普通(当前)
 *      智能适配器(adapter类里面增加对应新的功能)
 *      双向适配器(互相适配的双方同时适配,只需要在同一个适配器里面做两个接口的实现,书写对应方法逻辑即可)
 * 适配复杂度:取决于被适配两个对象之间的差异
 * 缺省适配器:选择性实现方法,根据需求去定
 * 优点:
 *      更好的复用性
 *      更好的可扩展性
 * 缺点:
 *      过多使用,会比较乱,交叉调用
 * 本质:转换匹配,复用功能
 *
 */
public class Client {
    public static void main(String[] args) {
        LogFileReadWriteApi logAdaptee = new LogFileReadWriteApiImpl();
        LogDBReadWriteApi log = new DB2FileAdapter(logAdaptee);

        log.add(new LogModel("2","data2"));
        System.out.println(log.findAll());
    }
}
