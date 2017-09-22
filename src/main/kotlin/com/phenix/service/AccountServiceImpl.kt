package com.phenix.service

import com.phenix.data.Account
import com.phenix.mapper.AccountMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service("accountService")
@Transactional
class AccountServiceImpl(@Autowired val accountMapper: AccountMapper) : AccountService {
    override fun findAllAccount(): List<Account> {
        return accountMapper.findAll()
    }

    override fun findById(id: Int): Account {
        return accountMapper.findById(id)
    }

}
