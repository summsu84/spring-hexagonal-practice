package com.teamjw.springhexgonalpractice.app.contract.infrastructure.persistence.jpa.adapter

import com.teamjw.springhexgonalpractice.app.contract.domain.model.Contract
import com.teamjw.springhexgonalpractice.app.contract.domain.spi.ContractPersistencePort
import com.teamjw.springhexgonalpractice.app.contract.infrastructure.persistence.jpa.repository.ContractRepository
import org.springframework.beans.factory.annotation.Autowired

class ContractJpaAdapter : ContractPersistencePort{

    // Repository 사용 한다.
    @Autowired
    lateinit var contractRepository: ContractRepository

    override fun addContract(contract: Contract) {
        TODO("Not yet implemented")
    }

    override fun getContract() : List<Contract>{
        val contractEntityList =contractRepository.findAll()
        val contractList = arrayListOf<Contract>()
        contractEntityList.forEachIndexed{ index, value ->
            var contract = Contract(value.id, value.name, value.description)
            contractList.add(contract)
        }
        return contractList
    }

    override fun getContractById(id: Integer) {
        TODO("Not yet implemented")
    }
}