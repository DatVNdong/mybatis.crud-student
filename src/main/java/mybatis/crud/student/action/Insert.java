package mybatis.crud.student.action;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.crud.student.mapper.StudentMapper;
import mybatis.crud.student.mapper.entity.Student;

public class Insert {

    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();

        // create student mapper
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        // insert student
        Student student = new Student("Jim", "IT", 90, 1234567, "jim-it@gmail.com");
        studentMapper.insert(student);
        session.commit();
        System.out.println("insert sucessfully");

        // close session
        session.close();
    }
}
