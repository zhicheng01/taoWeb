package com.taoWeb.service;

import com.taoWeb.entity.EUDataGridResult;

public interface ItemService {

    //查询所有商品
    public EUDataGridResult resultList(int page, int rows);
}
