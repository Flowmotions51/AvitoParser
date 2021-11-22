package ru.fedorov.avitoparser.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseStatus {
    public static final ResponseStatus OK = new ResponseStatus("Ok", 0);

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Return")
    private int code;

    public ResponseStatus(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public static ResponseStatus getOK() {
        return OK;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
