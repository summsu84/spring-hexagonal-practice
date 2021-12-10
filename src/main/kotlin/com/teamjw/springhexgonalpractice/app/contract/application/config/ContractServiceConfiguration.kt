package com.teamjw.springhexgonalpractice.app.contract.application.config

import com.teamjw.springhexgonalpractice.app.contract.application.adapter.ContractServiceAdapter
import com.teamjw.springhexgonalpractice.app.contract.domain.spi.ContractPersistencePort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ContractServiceConfiguration {

    @Bean
    fun getContractService(contractPersistencePort: ContractPersistencePort) : ContractServiceAdapter {
        return ContractServiceAdapter(contractPersistencePort)
    }
}