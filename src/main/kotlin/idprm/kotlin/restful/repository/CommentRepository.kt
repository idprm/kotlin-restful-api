package idprm.kotlin.restful.repository

import idprm.kotlin.restful.entity.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<Comment, String> {
}