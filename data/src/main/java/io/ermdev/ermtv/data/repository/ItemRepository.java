package io.ermdev.ermtv.data.repository;

import io.ermdev.ermtv.data.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("from Item where id=:itemId")
    Item findById(@Param("itemId") Long itemId);

    @Query("from Item")
    List<Item> findAll();
}
