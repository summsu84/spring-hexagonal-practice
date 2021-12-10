package com.teamjw.springhexgonalpractice.app.contract.infrastructure.persistence.jpa.entity

import lombok.Data
import javax.persistence.*

@Entity
@Table(name = "contract")
@Data
class ContractEntity(id: Long, name:String, description: String){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = id
    var name:String = name
    var description:String = description

}