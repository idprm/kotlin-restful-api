package idprm.kotlin.restful.repository

import idprm.kotlin.restful.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, String> {
}