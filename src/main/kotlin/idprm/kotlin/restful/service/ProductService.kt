package idprm.kotlin.restful.service

import idprm.kotlin.restful.entity.Product
import idprm.kotlin.restful.model.CreateProductRequest
import idprm.kotlin.restful.model.ListProductRequest
import idprm.kotlin.restful.model.ProductResponse
import idprm.kotlin.restful.model.UpdateProductRequest

interface ProductService {
    fun create(createProductRequest: CreateProductRequest) : ProductResponse

    fun get(id: String): ProductResponse

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)
}