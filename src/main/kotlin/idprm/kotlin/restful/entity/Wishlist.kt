package idprm.kotlin.restful.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "wishlists")
data class Wishlist(

    @Id
    val id: String
)
