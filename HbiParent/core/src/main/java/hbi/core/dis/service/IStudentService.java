package hbi.core.dis.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.dis.dto.Student;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface IStudentService extends IBaseService<Student>, ProxySelf<IStudentService> {
    @Transactional(propagation = Propagation.SUPPORTS)
    List<Student> queryAll(IRequest iRequest, Student student, int page, int pagesize);

    @Transactional(propagation = Propagation.SUPPORTS)
    void delBySid(IRequest iRequest,Long sid);

    @Transactional(propagation = Propagation.SUPPORTS)
    void submit(IRequest r ,Student student);

    @Transactional(propagation = Propagation.SUPPORTS)
    void update(IRequest iRequest,Student student);





}
