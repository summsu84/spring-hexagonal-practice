package com.teamjw.springhexgonalpractice.app.contract.infrastructure.config

import com.teamjw.springhexgonalpractice.app.contract.domain.spi.ContractPersistencePort
import com.teamjw.springhexgonalpractice.app.contract.infrastructure.persistence.inmemory.adapter.ContractInMemoryAdapter
import com.teamjw.springhexgonalpractice.app.contract.infrastructure.persistence.jpa.adapter.ContractJpaAdapter
import com.teamjw.springhexgonalpractice.app.contract.infrastructure.rest.ContractController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ContractInfrastructureConfiguration {

    @Bean
    fun getContractPersistenceAdapter() : ContractPersistencePort{
        //return ContractJpaAdapter()
        return ContractInMemoryAdapter()
    }

//    @Bean
//    fun getContractInboundAdapter() : ContractController {
//        return ContractController()
//    }
}