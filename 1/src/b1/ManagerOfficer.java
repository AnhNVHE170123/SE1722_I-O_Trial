/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class ManagerOfficer {
    private List<Officer> officers;
    
    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }
    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }
    
    public List<Officer> searchOfficerByName(String name) {
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
  

    public void showListInforOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
