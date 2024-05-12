package idprm.kotlin.restful.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "orders")
data class Order(

    @Id
    val id: String
)