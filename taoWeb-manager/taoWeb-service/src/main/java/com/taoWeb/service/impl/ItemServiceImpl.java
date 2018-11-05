package com.taoWeb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taoWeb.entity.EUDataGridResult;
import com.taoWeb.entity.TbItem;
import com.taoWeb.entity.TbItemExample;
import com.taoWeb.mapper.TbItemMapper;
import com.taoWeb.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    //查询所有商品,并进行分页处理,分页处理
	//第二次提交
    @Override
    public EUDataGridResult resultList(int page, int rows) {
        //创建example对象
        TbItemExample example = new TbItemExample();
        //进行分页处理
        PageHelper.startPage(page, rows);
        //调用方法，进行查询
        List<TbItem> itemList = tbItemMapper.selectByExample(example);
        //创建对象，接受查询结果
        EUDataGridResult dataGridResult = new EUDataGridResult();
        dataGridResult.setRows(itemList);
        //取记录总条数
        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(itemList);
        dataGridResult.setTotal(pageInfo.getTotal());
        return dataGridResult;
    }
}
