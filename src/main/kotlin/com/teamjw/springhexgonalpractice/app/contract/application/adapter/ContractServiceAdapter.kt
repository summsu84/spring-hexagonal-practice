package com.teamjw.springhexgonalpractice.app.contract.application.adapter

import com.teamjw.springhexgonalpractice.app.contract.application.api.ContractService
import com.teamjw.springhexgonalpractice.app.contract.domain.model.Contract
import com.teamjw.springhexgonalpractice.app.contract.domain.spi.ContractPersistencePort
import lombok.AllArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 *  계약 서비스를 구현하는 어댑터
 *  해당 어댑터는 Oubound Port를 사용 하며, Outbound Port를 구현하는 Oubound Adapter 를 실제 구현하여 주입해야 한다.
 *
 */
//@Service
class ContractServiceAdapter(contractPersistencePort: ContractPersistencePort) : ContractService  {

    // contractPersistencePort 의 구현체를 주입 한다.
    @Autowired
    lateinit var contractPersistencePort: ContractPersistencePort

    override fun addContract(contract: Contract) {
        TODO("Not yet implemented")
    }

    /**
     *  계약 정보 리스트를 가져온다.
     */
    override fun getContracts() : List<Contract> {
        val result = contractPersistencePort.getContract()

        return result
    }

    override fun getContractById(id: String): Contract {
        TODO("Not yet implemented")
    }
}