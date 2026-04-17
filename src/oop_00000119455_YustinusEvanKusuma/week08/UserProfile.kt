package oop_00000119455_YustinusEvanKusuma.week08

// name adalah Non-null (wajib), email dan phone adalah Nullabe (opsional)
class UserProfile (
    val name: String,
    val email: String?,
    val phone: String? = null // Default argument null
)