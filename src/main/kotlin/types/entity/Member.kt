package org.example.types.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Member (
    @Id
    @Column(nullable = false, length = 64)
    val ulid : String,

) {
}