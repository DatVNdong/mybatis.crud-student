package mybatis.crud.student.mapper.entity;

public class Student {

    private int id;
    private String name;
    private String branch;
    private int percentage;
    private int phone;
    private String email;

    public Student() {

    }

    public Student(String name, String branch, int percentage, int phone, String email) {
        super();
        this.name = name;
        this.branch = branch;
        this.percentage = percentage;
        this.phone = phone;
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPercentage() {
        return percentage;
    }

    public int getPhone() {
        return phone;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + "id = " + id + ", name = " + name + ", branch = " + branch
                + ", percentage = " + percentage + ", phone = " + phone + ", email = " + email + "]";
    }
}