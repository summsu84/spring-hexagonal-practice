package com.teamjw.springhexgonalpractice.app.contract.infrastructure.persistence.jpa.repository

import com.teamjw.springhexgonalpractice.app.contract.domain.model.Contract
import com.teamjw.springhexgonalpractice.app.contract.infrastructure.persistence.jpa.entity.ContractEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ContractRepository : JpaRepository<ContractEntity, Long>{

    //fun findById(contractId : Long) : ContractEntity
}