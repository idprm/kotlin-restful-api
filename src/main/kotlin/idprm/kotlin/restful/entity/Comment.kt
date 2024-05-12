package idprm.kotlin.restful.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "comments")
data class Comment(

    @Id
    val id: String
)
