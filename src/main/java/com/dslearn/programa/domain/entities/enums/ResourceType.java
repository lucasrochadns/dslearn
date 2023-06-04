package com.dslearn.programa.domain.entities.enums;

public enum ResourceType {
    LESSON_ONLY(1),
    LESSON_TASK(2),
    FORUM(3),
    EXTERNAL_LINK(4);

    private int code;

    private ResourceType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ResourceType valueOf(int code) {
        for (ResourceType value : ResourceType.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Type Resource Invalid");
    }
}
