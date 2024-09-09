package com.sparta.market.controller;

import com.sparta.market.dto.MessageDto;
import com.sparta.market.dto.RequestDto;
import com.sparta.market.dto.ResponseDto;
import com.sparta.market.entity.Item;
import com.sparta.market.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping("/post")
    public Item createItem(@RequestBody RequestDto requestDto){
       return itemService.createItem(requestDto);
    }
    @GetMapping("/post")
    public List<ResponseDto> getAllItem(){
        return itemService.getAllItem();
    }
    @PutMapping("/post/{id}")
    public Item updateItem(@PathVariable("id") Long id, @RequestBody RequestDto requestDto){
        return itemService.updateItem(id, requestDto);
    }
    @DeleteMapping("/post/{id}")
    public MessageDto deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
        return new MessageDto("삭제완료");
    }
}
