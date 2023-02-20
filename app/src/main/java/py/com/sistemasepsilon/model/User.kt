package py.com.sistemasepsilon.model

import java.io.Serializable

data class User(
    val name: String?,
    val surname: String?,
    val password: String?
): Serializable
