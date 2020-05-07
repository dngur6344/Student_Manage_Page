package com.church.demo.db;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.church.demo.teacher_inf.teacherDTO;
import java.util.List;

@Repository
public class ApiDao {
    protected static final String NAMESPACE = "com.church.demo.db.";

    @Autowired
    private SqlSession sqlSession;
    private List<teacherDTO> am;
    public String validate_teacher(String id, String password){
        am = sqlSession.selectList(NAMESPACE+"validate_teacher",id);
        if(am.size()==0) return null;
        String pass = am.get(0).getPassword();
        if(password.equals(pass)){
            return "true";
        }
        else return null;
    }
    public String selectName(){
        //return sqlSession.selectOne(NAMESPACE + "selectName");
        return am.get(0).getName();
    }
}
