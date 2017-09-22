package com.phenix.controller

import com.phenix.data.Account
import com.phenix.data.Greeting
import com.phenix.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController(@Autowired val accountService: AccountService) {
    val counter = AtomicLong()

    @GetMapping("/greeting")
    @ResponseBody
    fun greeting(@RequestParam(value = "name", defaultValue = "From Kotlin") name: String): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello $name")
    }

    @GetMapping("/findAll")
    @ResponseBody
    fun findAll(): List<Account> {
        return accountService.findAllAccount()
    }

    @GetMapping("/findById")
    @ResponseBody
    fun findById(@RequestParam(value = "id", defaultValue = "1") id: Int): Account {
        return accountService.findById(id)
    }

}