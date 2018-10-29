package com.devfon.todo.controller;


import com.devfon.todo.repository.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {
    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

//    @GetMapping("/list")
//    public List<Item> showList(){
//        Sort sortByCreatedDate = new Sort(Sort.Direction.DESC, "createdAt");
//        return itemRepository.findAll(sortByCreatedDate);
//    }
//
//    @PostMapping
//    public Item addItem(@RequestBody Item item){
//        return itemRepository.save(item);
//    }
//
//    @DeleteMapping(value = "/{title}")
//    public void deleteItem(@PathVariable String title){
//        itemRepository.findByTitle(title);
////        exception 처리해야 함
//        itemRepository.deleteByTitle(title);
//    }
//
//    @PutMapping("/{title}")
//    public void finishItem(@RequestBody Item item, @PathVariable String title){
//        if(!item.getTitle().equals(title)){
//            assert true;
//        }
//        itemRepository.findByTitle(title);
//
//    }
}
