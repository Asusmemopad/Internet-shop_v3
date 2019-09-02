package com.shopping.developing.service;

import com.shopping.developing.model.Goods;

import java.util.Optional;

public interface GoodsService {
   Iterable<Goods> getAllGoods();
   Optional<Goods> findById(Long id);
   Goods getGoodsByCode(Integer code);
   void saveGoods(Goods goods);
   void updateGoods(Goods goods);
   void deleteGoodsById(Long Id);
}
