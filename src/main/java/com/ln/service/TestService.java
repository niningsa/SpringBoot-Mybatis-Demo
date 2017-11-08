package com.ln.service;

import com.ln.dao.TestDao;
import com.ln.entity.SaleTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @Description:
 * @date 2017/11/1 17:31
 */
@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public List<SaleTest> getSaleList() {
        return testDao.getSaleList();
    }
}
