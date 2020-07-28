/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author Home
 */
public class Course {
   
private String name;
private String codeName;
private int numberOfClasses;


    public Course(){
    this.name = "undefined";
    this.codeName = "undefined";
    this.numberOfClasses = 0;
    

}
    public Course ( String customName, String customCodeName, int customNumberOfClasses){
    this.name = customName;
    this.codeName = customCodeName;
    this.numberOfClasses = customNumberOfClasses;
    
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }


}
