package facto;

class Server extends Computer {

    public Server(int cpu, int ram, int hdd) {
        super(cpu, ram, hdd);
    }

    @Override
    public void configure() {
        System.out.println("Configure Server");
    }

}
