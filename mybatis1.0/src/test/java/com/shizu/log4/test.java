package com.shizu.log4;

import com.shizu.dao.CompanyDao;
import com.shizu.entity.Company;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

  public static void main(String[] args) throws IOException {
      //1.读取配置文件
      InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
      //2.创建SqlSessionFactory工程
      SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
      SqlSessionFactory factory=builder.build(in);
      //3.使用工厂生产SqlSession对象
      SqlSession session=factory.openSession();
      //4.使用SqlSession 创建Dao接口的代理对象
      CompanyDao companyDao =session.getMapper(CompanyDao.class);
      //5.使用代理对象执行方法
      List<Company> companys=companyDao.proList();
      for(Company company:companys){
          System.out.println(company);
      }
      //6.释放资源
      session.close();
      in.close();
  }

}
