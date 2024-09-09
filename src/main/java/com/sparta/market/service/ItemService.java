package com.sparta.market.service;

import com.sparta.market.dto.RequestDto;
import com.sparta.market.dto.ResponseDto;
import com.sparta.market.entity.Item;
import com.sparta.market.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Item createItem(RequestDto requestDto) {
        Item item = new Item(requestDto);
        itemRepository.save(item);
        return item;
    }

    public List<ResponseDto> getAllItem() {
        List<Item> itemList = itemRepository.findAll();
        List<ResponseDto> dtoList = new ArrayList<>();
        for (Item item : itemList) {
            dtoList.add(new ResponseDto(item));
        }
      return dtoList;
    }


    public Item updateItem(Long id, RequestDto requestDto) {
        Item item = itemRepository.findById(id).orElseThrow(
                () ->  new IllegalArgumentException("존재하지 않는 게시글 입니다.")
        );
        item.update(requestDto);
        return item;
    }

    public void deleteItem(Long id){
        Item item = itemRepository.findById(id).orElseThrow(
                () ->  new IllegalArgumentException("존재하지 않는 게시글 입니다.")
        );
        itemRepository.delete(item);
    }
}
