package com.shahov.cdp.repositories;

import com.shahov.cdp.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {

    Cart getByCartId(long id);

    Cart getBySessionId(String id);

}
