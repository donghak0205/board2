package com.web.domain.enums;

public enum BoardType {
    notice("Notice"),
    free("FreeBoard");

    private String value;

    BoardType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

