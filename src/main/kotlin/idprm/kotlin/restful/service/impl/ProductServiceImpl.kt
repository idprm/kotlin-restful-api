package idprm.kotlin.restful.service.impl

import idprm.kotlin.restful.entity.Product
import idprm.kotlin.restful.error.NotFoundException
import idprm.kotlin.restful.model.CreateProductRequest
import idprm.kotlin.restful.model.ProductResponse
import idprm.kotlin.restful.repository.ProductRepository
import idprm.kotlin.restful.service.ProductService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.Date

@Service
class ProductServiceImpl(
    val productRepository: ProductRepository
) : ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
       val product = Product(
           id = createProductRequest.id!!,
           name = createProductRequest.name!!,
           price = createProductRequest.price!!,
           quantity = createProductRequest.quantity!!,
           createdAt = Date(),
           updatedAt = null
       )

        productRepository.save(product)
        return convertProductToResponse(product)
    }

    override fun get(id: String): ProductResponse {
        val product = findProductByIdOrThrowNotFound(id)
        return convertProductToResponse(product)
    }

    private fun findProductByIdOrThrowNotFound(id: String): Product {
        val product = productRepository.findByIdOrNull(id)
        if (product == null) {
            throw NotFoundException()
        } else {
            return product
        }
    }
    private fun convertProductToResponse(product: Product) : ProductResponse {
        return  ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )
    }

}