package io.ermdev.ermtv.data.repository;

import io.ermdev.ermtv.data.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
