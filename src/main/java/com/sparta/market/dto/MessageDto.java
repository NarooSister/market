package com.sparta.market.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class MessageDto {
    String msg;

    public MessageDto(String msg) {
        this.msg = msg;
    }
}
