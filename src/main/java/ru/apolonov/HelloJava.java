package ru.apolonov;

public class HelloJava {

    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1.cpu = "Intel";
        computer1.cpuSpeed = 3;
        computer1.motherBoard = "Asus";
        computer1.ram = 8;
        computer1.ssd = 256;

        Computer computer2 = new Computer();
        computer2.cpu = "AMD";
        computer2.cpuSpeed = 2;
        computer2.motherBoard = "Gigabite";
        computer2.ram = 16;
        computer2.ssd = 500;

        computer1.printConfig();
        computer2.printConfig();

    }
}
