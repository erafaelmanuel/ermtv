package io.ermdev.ermtv.rest.user;

import io.ermdev.ermtv.data.entity.Item;
import io.ermdev.ermtv.data.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {

    private ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @GetMapping("{itemId}")
    Item getById(@PathVariable("itemId") Long itemId) {
        return itemRepository.findById(itemId);
    }

    @GetMapping("all")
    List<Item> getAll() {
        return itemRepository.findAll();
    }

    @PostMapping
    public Item add(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @PutMapping
    public Item update(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @DeleteMapping
    public Item delete(@RequestBody Item item) {
        itemRepository.delete(item);
        return item;
    }
}
