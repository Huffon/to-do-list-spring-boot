//package com.devfon.todo.service;
//
//import com.devfon.todo.Item;
//import com.devfon.todo.repository.ItemRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ItemService {
//    private final ItemRepository itemRepository;
//
//    public ItemService(ItemRepository itemRepository){
//        this.itemRepository = itemRepository;
//    }
//
//    public Item add(Item item){
//        Item addedItem = this.itemRepository.save(item);
//        this.itemRepository.save(addedItem);
//
//        return addedItem;
//    }
//}
