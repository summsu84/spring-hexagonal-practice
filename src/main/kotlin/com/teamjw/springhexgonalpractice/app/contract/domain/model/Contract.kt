package com.teamjw.springhexgonalpractice.app.contract.domain.model

import lombok.Data

@Data
class Contract (id : Long, name : String, description : String){
    var id : Long = id
    var name : String = name
    var description : String = description


}