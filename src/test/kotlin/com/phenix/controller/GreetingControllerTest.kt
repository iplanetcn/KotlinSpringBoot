package com.phenix.controller

import org.hamcrest.Matchers.`is`
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@RunWith(SpringRunner::class)
@SpringBootTest
@WebAppConfiguration
class GreetingControllerTest {

    @Autowired
    private val greetingController: GreetingController? = null

    @Test
    @Throws(Exception::class)
    fun testingGreeting() {
        val mockMvc = MockMvcBuilders.standaloneSetup(this.greetingController).build()
        mockMvc.perform(
                get("/greeting").contentType(MediaType.APPLICATION_JSON_UTF8).param("name", "John"))
                .andExpect(status().isOk)
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath<String>("$.content", `is`<String>("Hello John")))
    }
}