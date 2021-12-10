package com.teamjw.springhexgonalpractice.app.contract.infrastructure.rest

import com.teamjw.springhexgonalpractice.app.contract.application.api.ContractService
import com.teamjw.springhexgonalpractice.app.contract.domain.model.Contract
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ContractController {

    // 인바운드 포트를 의존 한다.
    @Autowired
    lateinit var contractService : ContractService

    @GetMapping("/")
    fun getContract() : List<Contract>  {

        // contractService port 사용
        var result = contractService.getContracts()

        return result
    }
}