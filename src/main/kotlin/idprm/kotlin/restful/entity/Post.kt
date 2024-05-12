package idprm.kotlin.restful.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Post(

    @Id
    val id: String,

    @Column(name = "title")
    var title: String?,

    @Column(name = "created_at")
    var createdAt: Date,

    @Column(name = "updated_at")
    var updatedAt: Date?


)
