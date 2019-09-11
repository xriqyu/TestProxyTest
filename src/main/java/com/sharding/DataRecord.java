package com.sharding;

/**
 * @author : wangzhe
 * @date : Created in 2019-09-11 21:25
 * @description :
 */
public class DataRecord {

    private String uuid;

    private byte[] byteData;

    private int type;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public byte[] getByteData() {
        return byteData;
    }

    public void setByteData(byte[] byteData) {
        this.byteData = byteData;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
