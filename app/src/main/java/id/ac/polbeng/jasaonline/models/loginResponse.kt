package id.ac.polbeng.jasaonline.models

data class loginResponse(
    val message: String,
    val error: Boolean,
    val data: User
)
