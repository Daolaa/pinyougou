package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * 品牌服务层接口
 * @author gao
 */
public interface BrandService {
    /**
     * 返回全部列表
     * @return
     */
    List<TbBrand> findAll();

    /**
     * 返回分页结果
     * @return
     */
    PageResult findPage(int pageNum,int pageSize);

    /**
     * 品牌增加
     * @param brand
     */
    void add(TbBrand brand);

    /**
     * 根据ID 获取实体
     * @param id
     * @return
     */
    TbBrand findOne(Long id);

    /**
     * 修改实体
     * @param brand
     */
    void update(TbBrand brand);

    /**
     * 根据ID 删除
     * @param ids
     */
    void delete(Long[] ids);

    /**
     * 条件查询
     * @param tbBrand
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult search(TbBrand tbBrand,int pageNum,int pageSize);

    /**
     * 品牌下拉框数据
     */
    List<Map> selectOptionList();

}
