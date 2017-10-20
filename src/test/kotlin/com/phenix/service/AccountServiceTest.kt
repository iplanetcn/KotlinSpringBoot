package com.phenix.service

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class AccountServiceTest {

    @Autowired
    private val accountService: AccountService? = null

    @Test
    fun testAccountService() {
        val account = accountService!!.findById(1)
        assertEquals(account?.username, "john")
        assertEquals(account?.password, "123")
    }
}