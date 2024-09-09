package com.sparta.market.dto;

import com.sparta.market.entity.Item;
import lombok.Getter;

@Getter
public class RequestDto {
    String title;
    String content;
    String username;
    int price;
}
