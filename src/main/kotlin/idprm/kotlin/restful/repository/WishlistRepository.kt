package idprm.kotlin.restful.repository

import idprm.kotlin.restful.entity.Wishlist
import org.springframework.data.jpa.repository.JpaRepository

interface WishlistRepository : JpaRepository<Wishlist, String> {
}