package framgia.co.edu.ftrr.common;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Optional;

public enum RequestStatus {
    // Request just created
    WAITING(1, "Waiting"),

    // Request confirmed between division and education
    CONFIRMED(2, "Confirmed"),

    // Scheduling for interview
    IN_PROGRESS(3, "In progress"),

    // Interviewing
    INTERVIEW(4, "Interview"),

    WAITING_FINAL_RESULT(5, "Waiting final result"),

    // Finished interview
    DONE(6, "Done"),

    // Education doesn't has trainees or division has no need
    PENDING(7, "Pending"),

    // Education reject request
    REJECT(8, "Reject"),

    // EC pick trainees for request
    EC_PICK_TRAINEES(10, "Pick trainees");

    private String value;
    private Integer code;

    RequestStatus(Integer code, String value) {
        this.value = value;
        this.code = code;
    }

    public static Optional<RequestStatus> valueOf(int code) {
        return Arrays.stream(values())
                .filter(requestStatus -> requestStatus.code == code)
                .findFirst();
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
