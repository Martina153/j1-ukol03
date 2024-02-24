package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Chyba: Počítač je již zapnutý.");
        } else if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Chyba: Počítač nemůže být zapnutý, chybí procesor, paměť nebo pevný disk.");
        } else {
            jeZapnuty = true;
            System.out.println("Počítač se zapnul.");
        }
    }

    public void vypniSe() {
        if (!jeZapnuty) {
            return;
        }
        jeZapnuty = false;
        System.out.println("Počítač se vypnul.");
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Počítač je ").append(jeZapnuty ? "zapnutý" : "vypnutý").append(".\n");
        if (cpu != null) {
            sb.append("Procesor: ").append(cpu).append("\n");
        }
        if (ram != null) {
            sb.append("Paměť: ").append(ram.getKapacita()).append(" bajtů\n");
        }
        if (pevnyDisk != null) {
            sb.append("Pevný disk: ").append(pevnyDisk.getKapacita()).append(" bajtů\n");
        }
        return sb.toString();
    }
}
