package mybatis.crud.student.mapper;

import java.util.List;

import mybatis.crud.student.mapper.entity.Student;

public interface StudentMapper {

    int deleteById(int id);

    int insert(Student student);

    List<Student> selectAll();

    Student selectById(int id);

    int update(Student student);
}
