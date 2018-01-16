package io.ermdev.ermtv.data.repository;

import io.ermdev.ermtv.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
