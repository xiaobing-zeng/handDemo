package hbi.core.dis.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.message.IMessagePublisher;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.dis.dto.Student;
import hbi.core.dis.mapper.StudentMapper;
import hbi.core.dis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {
    @Autowired
    StudentMapper studentMapper;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Student> queryAll(IRequest iRequest, Student student, int page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        return this.studentMapper.queryAll(student);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void delBySid(IRequest request,Long sid) {
        if(sid != null) {
            studentMapper.delBySid(sid);
        }
    }

    @Override
    public void submit(IRequest r, Student students) {
        studentMapper.submit(students);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void update(IRequest iRequest, Student student) {
        studentMapper.update(student);
    }


}
