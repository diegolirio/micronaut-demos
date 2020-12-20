package com.diegolirio.micronaut.customer.application

import com.diegolirio.micronaut.customer.domain.Customer
import javax.inject.Singleton

interface CustomerService {
    fun getAll(): List<Customer>
    fun save(customer: Customer): Customer
}

@Singleton
class CustomerServiceImpl : CustomerService {

    override fun getAll(): List<Customer> {
        val c = Customer("a1a2a21a", "Diego Lirio")
        return listOf(c)
    }

    override fun save(customer: Customer): Customer {
        TODO("Not yet implemented")
    }
}