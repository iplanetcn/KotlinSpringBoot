package com.phenix.data

open class Greeting(val id: Long, val content: String)

open class Account(val id: Int, val username: String, val password: String)

open class Resp(val code: Int, val message: String)

open class RespData<T>(code: Int, message: String, val data: T?) : Resp(code, message)