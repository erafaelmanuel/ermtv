package io.ermdev.ermtv.data.repository;

import io.ermdev.ermtv.data.entity.Bookmark;
import io.ermdev.ermtv.data.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    @Query("from Bookmark where id=:bookmarkId")
    Bookmark findById(@Param("bookmarkId") Long bookmarkId);

    @Query("from Bookmark")
    List<Bookmark> findAll();
}
