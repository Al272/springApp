package ru.gridnine.burlakov;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}
    public static ClassicalMusic getInstance(){
        return new ClassicalMusic();
    }
    public void initMethod(){
        System.out.println("Doing my initilialization");
    }
    public void destroyMethod(){
        System.out.println("Doing my destroy");
    }
    @Override
    public String getSong() {
        return "Hungrarian Rapsody";
    }
}
