package com.shahov.cdp.repositories;

import com.shahov.cdp.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    User getById(long id);

    User getByEmail(String email);

    @Query(value = "select * from user", nativeQuery = true)
    List<User> getAllBooksAvailable();
}
