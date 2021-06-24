package hbi.core.dis.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.dis.dto.Student;

import java.util.List;

public interface StudentMapper extends Mapper<Student> {
    /*
    * 查询所以学生对象
    * @parm
    * @return
    */
    List<Student> queryAll(Student student);

    /*
     * 通过sid删除学生对象
     * @parm sid
     * @return
     */
    Long delBySid(Long sid);

    /*
     * 新增学生对象
     * @parm
     * @return
     */
    int submit(Student student);

    /*
     * 修改学生信息
     * @parm sid
     * @return
     */
    int update(Student student);
}
