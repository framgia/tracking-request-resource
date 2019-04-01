package framgia.co.edu.ftrr.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Roles {
    SM(1, "Section Manager"),
    DM(2, "Division Manager"),
    HR(3, "Human Resource"),
    EC(4, "Education Coordinator"),
    TRAINER(5, "Trainer"),
    GL(6, "Group leader"),
    OTHER(7, "Employee"),
    TL(8, "Team leader");

    private String value;
    private Integer code;

    Roles(Integer code, String value) {
        this.value = value;
        this.code = code;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    @JsonValue
    public Integer getCode() {
        return this.code;
    }
}