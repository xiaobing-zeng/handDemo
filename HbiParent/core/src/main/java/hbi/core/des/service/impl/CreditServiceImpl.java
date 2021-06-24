package hbi.core.des.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.des.mapper.CreditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hbi.core.des.dto.Credit;
import hbi.core.des.service.ICreditService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CreditServiceImpl extends BaseServiceImpl<Credit> implements ICreditService{

    @Autowired
    private CreditMapper creditMapper;

    @Override
    public List<Credit> selectCreditBySId(IRequest requestContext, Credit credit, int page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        return creditMapper.selectCreditBysId(credit);
    }

}