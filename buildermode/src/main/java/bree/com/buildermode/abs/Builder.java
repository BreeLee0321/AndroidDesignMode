package bree.com.buildermode.abs;

/**
 * Created by bree on 2017/5/4.
 */

public abstract class Builder {
    //设置主机
    public abstract Builder buildBoard(String board);
    //设置显示器
    public abstract Builder buildDispaly(String display);
    //设置操作系统
    public abstract Builder buildOS();
    //创建computer
    public abstract Computer create();
}
