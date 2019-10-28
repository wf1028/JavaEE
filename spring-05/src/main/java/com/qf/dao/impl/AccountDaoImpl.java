package com.qf.dao.impl;

import com.qf.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void increaseMoney(Integer id, Double money) {
      int i=1/0;
        getJdbcTemplate().update("update account set money = money+? where id = ? ", money,id);

    }

    @Override
    public void decreaseMoney(Integer id, Double money) {

        getJdbcTemplate().update("update account set money = money-? where id = ? ", money,id);
    }
}
