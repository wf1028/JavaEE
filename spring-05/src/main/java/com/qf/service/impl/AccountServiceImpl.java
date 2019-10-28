package com.qf.service.impl;

import com.qf.dao.AccountDao;
import com.qf.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
@Transactional(isolation= Isolation.REPEATABLE_READ,propagation= Propagation.REQUIRED,readOnly=true)
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
  /*  private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void transfer(final Integer from,final Integer to,final Double money) {

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus arg0) {
                // 减钱
                accountDao.decreaseMoney(from, money);
                int i = 1 / 0;// 如果发生异常数据（钱）不会丢失
                // 加钱
                accountDao.increaseMoney(to, money);

            }
        });
    }*/
  @Transactional(isolation= Isolation.REPEATABLE_READ,propagation= Propagation.REQUIRED,readOnly=false)
    public void transfer(Integer from, Integer to, Double money) {
        // 减钱
        accountDao.decreaseMoney(from, money);
        // int i = 1 / 0;// 如果发生异常数据（钱）会丢失
        // 加钱
        accountDao.increaseMoney(to, money);
    }

}

