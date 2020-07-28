/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author Home
 */
public class Computer {
    
    private String operatingSystem;
    private double procesTact;
    private double memory;
    private int hardDrive;
    
    
    public Computer(){
        this.operatingSystem = "";
        this.memory = 0.0;
        this.procesTact = 0.0;
        this.hardDrive = 0;
    
       
    }
    
    public Computer ( String customOperatingSystem, double customProcesTact, double customMemory, int customHardDrive){
        this.procesTact = customProcesTact;
        this.memory = customMemory;
        this.operatingSystem = customOperatingSystem;
        this.hardDrive = customHardDrive;
        
    
    
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getProcesTact() {
        return procesTact;
    }

    public void setProcesTact(double procesTact) {
        this.procesTact = procesTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    
}
