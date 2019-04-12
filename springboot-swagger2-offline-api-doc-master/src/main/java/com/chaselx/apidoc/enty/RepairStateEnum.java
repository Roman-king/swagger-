package com.chaselx.apidoc.enty;

public enum RepairStateEnum {
    FORMAL("0", "维修中"),//正常，没有错误
    FINISH_STATE("1", "已完成"),
    PART_FINISH_STATE("2", "部分完成维修"),
    CANCEL_FINISH_STATE("3", "取消完成"),
    OTHER_STATE("4", "其他");
    private String code;
    private String state;


    RepairStateEnum(String code, String state) {
        this.code = code;
        this.state = state;
    }

    public static String getCode(String state) {
        for (RepairStateEnum c : RepairStateEnum.values()) {
            if (c.getState() == state) {
                return c.code;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getState() {
        return state;
    }
}
