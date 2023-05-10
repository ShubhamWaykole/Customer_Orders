package com.workspace.customerorders.service;

import com.workspace.customerorders.entities.Item;
import com.workspace.customerorders.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    Logger log = (Logger) LoggerFactory.getLogger(ItemService.class);

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> postAllItems(List<Item> items)
    {
        return itemRepository.saveAll(items);
    }

    public List<Item> getAllItems()
    {
        return itemRepository.findAll();
    }
}
