package idprm.kotlin.restful.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="users")
data class User(

    @Id
    val id: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String,
)
