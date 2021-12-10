package com.teamjw.springhexgonalpractice.app.contract.application.api

import com.teamjw.springhexgonalpractice.app.contract.domain.model.Contract

/**
 *  주 포트
 *  인바운드 어댑터 해당 포트를 통해서 어플리케이션으로 접근 하게 된다.
 */
interface ContractService {

    // 계약 등록
    fun addContract(contract: Contract);

    // 계약 조회
    fun getContracts() : List<Contract>

    // 계약 상세 조회
    fun getContractById(id: String): Contract;
}
