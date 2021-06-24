package hbi.core.des.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.des.dto.Credit;

import java.util.List;

public interface ICreditService extends IBaseService<Credit>, ProxySelf<ICreditService>{
    List<Credit> selectCreditBySId(IRequest requestContext, Credit credit, int page, int pagesize);
}