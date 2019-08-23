package com.shopping.developing.repository;

import com.shopping.developing.model.Goods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends CrudRepository<Goods, Long> {
}
