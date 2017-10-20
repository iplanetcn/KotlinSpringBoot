package com.phenix.service

import com.phenix.data.Account

interface AccountService {
    fun findAllAccount(): List<Account>
    fun findById(id:Int): Account?
}