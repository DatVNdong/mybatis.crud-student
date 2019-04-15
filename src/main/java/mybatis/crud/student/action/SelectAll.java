package mybatis.crud.student.action;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.crud.student.mapper.StudentMapper;
import mybatis.crud.student.mapper.entity.Student;

public class SelectAll {

    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();

        // create student mapper
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        // show list student
        List<Student> listStudents = studentMapper.selectAll();
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

        // close session
        session.close();
    }
}