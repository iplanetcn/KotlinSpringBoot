package com.phenix.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

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