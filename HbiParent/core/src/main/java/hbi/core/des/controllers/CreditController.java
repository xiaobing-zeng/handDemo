package hbi.core.des.controllers;

import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.des.dto.Credit;
import hbi.core.des.service.ICreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

    @Controller
    public class CreditController extends BaseController{

    @Autowired
    private ICreditService service;


    @RequestMapping(value = "/des/credit/query")
    @ResponseBody
    public ResponseData query(Credit dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

        @RequestMapping(value = "/des/credit/queryBySId")
        @ResponseBody
        public ResponseData selectCreditBySId(Credit dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                                       @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
            IRequest requestContext = createRequestContext(request);
            return new ResponseData(service.selectCreditBySId(requestContext, dto, page, pageSize));
        }


        @RequestMapping(value = "/des/credit/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<Credit> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
        ResponseData responseData = new ResponseData(false);
        responseData.setMessage(getErrorMessage(result, request));
        return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/des/credit/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<Credit> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    }