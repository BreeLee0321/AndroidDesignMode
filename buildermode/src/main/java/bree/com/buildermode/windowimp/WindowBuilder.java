package bree.com.buildermode.windowimp;

import bree.com.buildermode.abs.Builder;
import bree.com.buildermode.abs.Computer;

/**
 * Created by bree on 2017/5/4.
 */

public class WindowBuilder extends Builder{
    private WindowBook computer=new WindowBook();

    public WindowBuilder(){
        computer.setOS();
    }
    @Override
    public Builder buildBoard(String board) {
        computer.setBoard(board);

        return this;
    }

    @Override
    public Builder buildDispaly(String display) {
        computer.setDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        computer.setOS();
        return this;
    }


    @Override
    public Computer create() {
        return computer;
    }
}
