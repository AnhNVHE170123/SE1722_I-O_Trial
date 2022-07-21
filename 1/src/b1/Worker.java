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
public class Worker extends Officer{
    private int level;
    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" + "Name: " + name + ", age: " + age + ", gender: " + gender + ", address: " + address + ", level: " + level + '}';
    }
    
}
