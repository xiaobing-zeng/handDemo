package hbi.core.des.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import hbi.core.des.dto.Info;
import hbi.core.des.service.IInfoService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class InfoServiceImpl extends BaseServiceImpl<Info> implements IInfoService{

}