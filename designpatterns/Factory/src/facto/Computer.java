package facto;

abstract class Computer implements IComputer {

    protected int cpu;
    protected int hdd;
    protected int ram;

    public Computer(int cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public void display() {
        System.out.println("Ram: " + ram + " Cpu: " + cpu);
    }

    @Override
    public int getCpu() {
        return cpu;
    }

    @Override
    public int getHdd() {
        return hdd;
    }

    @Override
    public int getRam() {
        return ram;
    }

}
