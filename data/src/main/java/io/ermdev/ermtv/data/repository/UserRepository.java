package io.ermdev.ermtv.data.repository;

import io.ermdev.ermtv.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("from User where id=:userId")
    User findById(@Param("userId") Long userId);
}
