package ru.apolonov;

public class Computer {

    private static String pc = "Персональный компьютер";

    private int cpuSpeed;
    private int ram;
    private String motherBoard;
    private int ssd;
    private Cpu cpu;

    static class Cpu {
        private String modelCpu;

        public Cpu(String modelCpu) {
            this.modelCpu = modelCpu;
        }

        public String getModelCpu() {
            return modelCpu;
        }

        public void setModelCpu(String modelCpu) {
            this.modelCpu = modelCpu;
        }
    }

    public Computer(int cpuSpeed, int ram) {
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
    }

    public Computer(int cpuSpeed, int ram, String motherBoard, int ssd) {

        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.motherBoard = motherBoard;
        this.ssd = ssd;
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public static void getClassName() {
        System.out.println(pc);
        System.out.println(Computer.class.getName());
    }
}
