package io.ermdev.ermtv.repository;

import io.ermdev.ermtv.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
