package com.church.demo.teacher_inf;

public class teacherDTO {
    private String name;
    private String teacher_id;
    private String password;
    private String tel;
    private String birthday;
    public teacherDTO(String name,String teacher_id,String password,String tel,String birthday){
        this.name=name;
        this.teacher_id=teacher_id;
        this.password=password;
        this.tel=tel;
        this.birthday=birthday;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTeacher_id(){
        return this.teacher_id;
    }
    public void setTeacher_id(String teacher_id){
        this.teacher_id=teacher_id;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public String getBirthday(){
        return this.birthday;
    }
    public void setBirthday(String birthday){
        this.birthday=birthday;
    }
}
