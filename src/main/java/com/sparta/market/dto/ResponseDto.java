package com.sparta.market.dto;

import com.sparta.market.entity.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class ResponseDto {
    private Long id;
    private String username;
    private String title;
    private int price;

    public ResponseDto(Item item){
        this.id = item.getId();
        this.title = item.getTitle();
        this.username = item.getUsername();
        this.price = item.getPrice();
    }
}
