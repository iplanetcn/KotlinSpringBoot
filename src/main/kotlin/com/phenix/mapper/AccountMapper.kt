package com.phenix.mapper

import com.phenix.data.Account
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface AccountMapper {

    @Select("SELECT * FROM account")
    fun findAll(): List<Account>

    @Select("SELECT * FROM account where id=#{id}")
    fun findById(@Param("id") id: Int): Account
}