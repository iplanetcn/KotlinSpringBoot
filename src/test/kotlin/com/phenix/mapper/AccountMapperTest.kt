package com.phenix.mapper

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

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