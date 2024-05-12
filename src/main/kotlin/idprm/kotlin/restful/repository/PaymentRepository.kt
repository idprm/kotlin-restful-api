package idprm.kotlin.restful.repository

import idprm.kotlin.restful.entity.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, String> {
}