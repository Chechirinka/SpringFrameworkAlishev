package org.example;

public class ClassicalMusic implements Music{
    public void doMyInit(){
        System.out.println("Do my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my distraction");
    }

    @Override
    public String getSong() {
        return "Hungrian Rhapsody";
    }
}
