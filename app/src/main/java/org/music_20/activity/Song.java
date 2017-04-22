package org.music_20.activity;

/**
 * Created by Administrator on 2017/4/22.
 */

public class Song extends Data<Song> {
    private String fall_name, size;

    public Song(String name, String path, String type, String fall_name, String size) {
        super(name, path, type);
        this.fall_name = fall_name;
        this.size = size;
    }

    public String getFall_name() {
        return fall_name;
    }

    @Override
    protected String givefall_name() {
        return fall_name;
    }


    @Override
    public String getSize() {
        return size;
    }

    @Override
    protected String giveSize() {
        return getSize();
    }

    @Override
    protected int giveCount() {
        return 0;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    protected String giveType() {
        return type;
    }
}