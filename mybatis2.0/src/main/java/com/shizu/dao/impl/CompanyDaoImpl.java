package com.shizu.dao.impl;

import com.shizu.dao.CompanyDao;
import com.shizu.entity.Company;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CompanyDaoImpl implements CompanyDao {
    private SqlSessionFactory factory;
    public CompanyDaoImpl(SqlSessionFactory factory){
        this.factory=factory;
    }
    public List<Company> proList() {
        //1.使用工程创建SqlSession对象
        SqlSession session=factory.openSession();
        //2.使用session执行查询所有方法
        List<Company> companys=session.selectList("com.shizu.dao.CompanyDao.proList");
        session.close();
        return companys;
    }
}
