package ma.devboss.ebank;

import ma.devboss.ebank.system.EBankSystemJava;
import ma.devboss.ebank.system.IEBankSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To DevBoss Bank");
        IEBankSystem bankSystem = new EBankSystemJava();
        bankSystem.run();
    }
}