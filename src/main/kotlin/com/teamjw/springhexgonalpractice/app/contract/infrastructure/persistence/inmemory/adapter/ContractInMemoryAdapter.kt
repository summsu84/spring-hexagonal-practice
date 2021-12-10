package com.teamjw.springhexgonalpractice.app.contract.infrastructure.persistence.inmemory.adapter

import com.teamjw.springhexgonalpractice.app.contract.domain.model.Contract
import com.teamjw.springhexgonalpractice.app.contract.domain.spi.ContractPersistencePort

class ContractInMemoryAdapter : ContractPersistencePort {

    val contractMap = mutableMapOf<String, Contract>()

    constructor() {
        val constract = Contract(1, "11", "22")

        contractMap["1"] = constract
    }


    // 계약을 추가한다.
    override fun addContract(contract: Contract) {
        TODO("Not yet implemented")
    }

    // 계약 리스트를 가져온다.
    override fun getContract(): List<Contract> {
        val contractList = mutableListOf<Contract>()

        contractMap.forEach{(key, value) -> contractList.add(value)}

        return contractList
    }

    // 계약 상세를 가져온다.
    override fun getContractById(id: Integer) {
        TODO("Not yet implemented")
    }
}