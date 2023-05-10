package com.workspace.customerorders.rest;

import com.workspace.customerorders.entities.Item;
import com.workspace.customerorders.repository.ItemRepository;
import com.workspace.customerorders.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemController {
    Logger log = (Logger) LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    @PostMapping
    @ResponseBody
    public List<Item> createItems(@RequestBody List<Item> listItems)
    {
        return itemService.postAllItems(listItems);
    }

    @GetMapping
    @ResponseBody
    public List<Item> getAllItems()
    {
        return itemService.getAllItems();
    }
}
