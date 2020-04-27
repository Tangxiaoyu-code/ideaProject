package com.shizu.dao;

import com.shizu.entity.Company;

import java.util.List;

/**
 * @author txy
 * 用户的持久层接口
 */
public interface CompanyDao {
    /**
     * 查询所有操作
     * @return
     */
    public List<Company> proList();
}
