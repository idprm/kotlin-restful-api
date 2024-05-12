package idprm.kotlin.restful.repository

import idprm.kotlin.restful.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String> {
}