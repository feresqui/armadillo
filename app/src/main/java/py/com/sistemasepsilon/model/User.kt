package py.com.sistemasepsilon.model

import java.io.Serializable

data class User(
    val name: String?,
    val surname: String?,
    val password: String?
): Serializable {
    fun isEmpty(): Boolean {
        return this.name?.isEmpty() ?: true && this.surname?.isEmpty() ?: true && this.password?.isEmpty() ?: true
    }
}
