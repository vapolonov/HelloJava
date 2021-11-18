package ru.apolonov;

public class HelloJava {

    public static void main(String[] args) {

        Computer computer1 = new Computer(3, 32);
        Computer computer2 = new Computer(2, 16, "Gigabyte", 500);
        computer1.cpu = new Computer.Cpu("Intel");
        computer2.cpu = new Computer.Cpu("AMD");


        System.out.println("Конфигурация компьютера: " + "\n"
                + "Процессор - " + computer1.cpu.getModelCpu() + "\n"
                + "Частота процессора - " + computer1.getCpuSpeed() + "\n"
                + "Объем оперативной памяти - " + computer1.getRam() + " GHz");

        System.out.println();

        System.out.println("Конфигурация компьютера: " + "\n"
                + "Процессор - " + computer2.cpu.getModelCpu() + "\n"
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
