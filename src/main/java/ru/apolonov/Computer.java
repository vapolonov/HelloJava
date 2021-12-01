package ru.apolonov;

public class Computer {

    String cpu;
    int cpuSpeed;
    int ram;
    String motherBoard;
    int ssd;

    public void printConfig() {
        System.out.println("Конфигурация компьютера:" +
                "процессор - " + cpu + "," +
                "частота - " + cpuSpeed + " ГГц, " +
                "объем оперативной памяти - " + ram + " ГБ, " +
                "материнская плата - " + motherBoard +
                ", жесткий диск - " + ssd + " Гб.");
    }

    public void ramAdd() {
        ram = ram + 2;
    }
    public void changeCpu(String cpu) {
        this.cpu = cpu;
    }
}
