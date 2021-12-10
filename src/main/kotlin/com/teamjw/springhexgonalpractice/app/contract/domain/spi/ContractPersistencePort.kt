package com.teamjw.springhexgonalpractice.app.contract.domain.spi

import com.teamjw.springhexgonalpractice.app.contract.domain.model.Contract

/**
 *  응용에서 외부로 나가는 포트 인터페이스
 */
interface ContractPersistencePort {

    fun addContract(contract : Contract)

    fun getContract() : List<Contract>

    fun getContractById(id : Integer)

}