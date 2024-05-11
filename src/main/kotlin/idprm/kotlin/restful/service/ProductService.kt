package idprm.kotlin.restful.service

import idprm.kotlin.restful.model.CreateProductRequest
import idprm.kotlin.restful.model.ProductResponse

interface ProductService {
    fun create(createProductRequest: CreateProductRequest) : ProductResponse

    fun get(id: String): ProductResponse
}