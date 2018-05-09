package com.mytimer.gozdekaval.mahkums;

/**
 * Created by Gozde Kaval on 6/30/2016.
 */
public class Prisoner {

    private int no;
    private boolean is;

    public Prisoner(int n, boolean i){
        no = n;
        is = i;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public boolean isIs() {
        return is;
    }

    public void setIs(boolean is) {
        this.is = is;
    }
}
