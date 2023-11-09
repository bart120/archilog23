package facto;

class Desktop extends Computer {

    public Desktop(int cpu, int ram, int hdd) {
        super(cpu, ram, hdd);
    }

    @Override
    public void configure() {
        System.out.println("Configure Desktop");
    }

}
