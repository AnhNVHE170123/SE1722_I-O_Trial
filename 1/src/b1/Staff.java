/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

/**
 *
 * @author Admin
 */
public class Staff extends Officer {
    private String task;

    

    public Staff(String name, int age, String gender, String address, String task) {
       super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff{" + "Name: " + name + ", age: " + age + ", gender: " + gender + ", address: " + address + ", task: " + task + '}';
    }
    
}
