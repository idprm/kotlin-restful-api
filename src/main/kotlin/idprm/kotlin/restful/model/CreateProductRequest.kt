package idprm.kotlin.restful.model
import jakarta.validation.constraints.*

data class CreateProductRequest(

    @field:NotBlank
    val id: String?,

    @field:NotBlank
    val name: String?,

    @field:NotNull
    @field:Min(value = 0)
    val price: Long?,

    @field:NotNull
    @field:Min(value = 0)
    val quantity: Int?
)
