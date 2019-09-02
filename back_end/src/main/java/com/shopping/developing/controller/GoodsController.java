package com.shopping.developing.controller;

import com.shopping.developing.model.Goods;
import com.shopping.developing.service.GoodsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    private final GoodsService goodsService;

    public GoodsController(final GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @GetMapping("goods")
    public ResponseEntity<List<Goods>> listAllAuthorsBooks() {
        List<Goods> goodsList =
                (List<Goods>) goodsService.getAllGoods();
        if (goodsList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(goodsList, HttpStatus.OK);
    }


}
