package io.ermdev.ermtv.rest.user;

import io.ermdev.ermtv.data.entity.Item;
import io.ermdev.ermtv.data.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
