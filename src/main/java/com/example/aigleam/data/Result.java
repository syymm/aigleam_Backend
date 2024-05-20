package com.example.aigleam.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {

    private T data;
    private int code;
    private String msg;

}
