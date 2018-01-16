package io.ermdev.ermtv.data.repository;

import io.ermdev.ermtv.data.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
}
