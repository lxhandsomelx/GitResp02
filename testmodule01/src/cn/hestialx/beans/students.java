package cn.hestialx.beans;

/**
 * @author lixu
 * @create 2022-02-25-20:45
 */
public class students {
    String name;
    int id;
    students(){
        System.out.println("创建学生类");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
