package com.diegolirio.micronaut.customer.presentation

import com.diegolirio.micronaut.customer.application.CustomerService
import com.diegolirio.micronaut.customer.domain.Customer
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/customers")
class CustomerController(private val customerService: CustomerService) {

    @Get
    open fun get(): HttpResponse<*> {
        val list = customerService.getAll()
        return HttpResponse.ok<List<Customer>>(list)
    }
}