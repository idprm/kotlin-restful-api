package idprm.kotlin.restful.repository

import idprm.kotlin.restful.entity.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, String> {
}