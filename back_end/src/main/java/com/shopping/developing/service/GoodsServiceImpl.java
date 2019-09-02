package com.shopping.developing.service;

import com.shopping.developing.model.Goods;
import com.shopping.developing.repository.GoodsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {

    private final GoodsRepository goodsRepository;

    public GoodsServiceImpl(final GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public Iterable<Goods> getAllGoods() {
        return goodsRepository.findAll();
    }

    @Override
    public Optional<Goods> findById(Long id) {
        return goodsRepository.findById(id);
    }

    @Override
    public Goods getGoodsByCode(Integer code) {
        return null;
    }

    @Override
    public void saveGoods(Goods goods) {

    }

    @Override
    public void updateGoods(Goods goods) {

    }

    @Override
    public void deleteGoodsById(Long Id) {

    }

}
