package hbi.core.dis.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.dis.dto.Student;
import hbi.core.dis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/api/public")
public class StudentControllers extends BaseController {
    @Autowired
    private IStudentService studentService;

    public StudentControllers() {
    }

    @RequestMapping(
            value = {"/queryAll"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    @ResponseBody
    public ResponseData queryAll(Student student, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pagesize, HttpServletRequest request) {
        IRequest requestContext = this.createRequestContext(request);
        return new ResponseData(this.studentService.queryAll(requestContext, student, page, pagesize));
    }

    @RequestMapping(
            value = {"/delBySid"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    @ResponseBody
    public  void delBySid(HttpServletRequest request, Long sid) {
        IRequest requestContext = this.createRequestContext(request);
        if(sid != null) {
            studentService.delBySid(requestContext,sid);
        }

    }

    @RequestMapping(
            value = {"/submit"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    @ResponseBody
    public void submit(HttpServletRequest request,Student student) {
        IRequest request1 = this.createRequestContext(request);
        studentService.submit(request1,student);
    }

    @RequestMapping(
            value = {"/update"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    @ResponseBody
    public  void update(HttpServletRequest request, Student student) {
        IRequest requestContext = this.createRequestContext(request);
                studentService.update(requestContext,student);
    }

}
