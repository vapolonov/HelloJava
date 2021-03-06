package ru.apolonov;

public class HelloJava {

    public static void main(String[] args) {

        Computer computer1 = new Computer(3, 32);
        Computer computer2 = new Computer(2, 16, "Gigabyte", 500);
        Computer.Cpu cpu1= new Computer.Cpu("Intel");
        Computer.Cpu cpu2 = new Computer.Cpu("AMD");


        System.out.println("Конфигурация компьютера: " + "\n"
                + "Процессор - " + cpu1.getModelCpu() + "\n"
                + "Частота процессора - " + computer1.getCpuSpeed() + "\n"
                + "Объем оперативной памяти - " + computer1.getRam() + " GB");

        System.out.println();

        System.out.println("Конфигурация компьютера: " + "\n"
                + "Процессор - " + cpu2.getModelCpu() + "\n"
                + "Частота процессора - " + computer2.getCpuSpeed() + " GHz" + "\n"
                + "Объем оперативной памяти - " + computer2.getRam() + " GB" + "\n"
                + "Материнская плата - " + computer2.getMotherBoard() + "\n"
                + "Объем жесткого диска - " + computer2.getSsd() + " GB");
        computer2.setRam(32);

        System.out.println("Оперативная память увеличена до " + computer2.getRam() + " GB");

        System.out.println();

        Computer.getClassName();

    }
}
