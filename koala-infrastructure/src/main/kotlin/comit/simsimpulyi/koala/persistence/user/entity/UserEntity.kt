package comit.simsimpulyi.koala.persistence.user.entity

import comit.simsimpulyi.koala.domain.user.model.Authority
import comit.simsimpulyi.koala.persistence.BaseUUIDEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "tbl_user")
class UserEntity(
    @field:NotNull
    @field:Length(max = 10)
    var name: String,

    @field:NotNull
    @Column(columnDefinition = "CHAR(60)")
    var password: String,

    @field:NotNull
    var email: String,

    @field:NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    var authority: Authority
) : BaseUUIDEntity()