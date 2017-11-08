package com.ln.dao;

import com.ln.entity.SaleTest;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @Description:
 * @date 2017/11/1 17:26
 */
@Repository
public interface TestDao {

    List<SaleTest> getSaleList();
}
