package hbi.core.des.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.des.dto.Credit;

import java.util.List;

public interface CreditMapper extends Mapper<Credit>{
    List<Credit> selectCreditBysId(Credit credit);
    boolean deleteCreditBySId(Credit credit);


}