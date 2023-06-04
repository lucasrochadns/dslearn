package com.dslearn.programa.domain.entities.enums;

public enum DeliverStatus {
    PENDING(1), ACCEPTED(2), REJECTED(3);
    private int code;

    private DeliverStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static DeliverStatus valueOf(int code) {
        for (DeliverStatus value : DeliverStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Type Resource Invalid");
    }
}
