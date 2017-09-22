package com.phenix.mapper

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class AccountMapperTest {

    @Suppress("SpringKotlinAutowiring")
    @Autowired
    private val accountMapper: AccountMapper? = null

    @Test
    @Throws(Exception::class)
    fun testFindByUsername() {
        val username = "john"
        val password = "123"
        val account = accountMapper!!.findById(1)
        assertEquals(account.username, username)
        assertEquals(account.password, password)
    }
}