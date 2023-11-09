package facto;

import java.util.ArrayList;
import java.util.List;

public final class Factory {
    private static Factory INSTANCE;

    private Factory() {
    }

    private List<IComputer> computers = new ArrayList<>();

    public void displayAll() {
        for (IComputer computer : computers) {
            computer.display();
        }
    }

    public IComputer createComputer(String type, int cpu, int ram, int hdd) {
        if (type.equals("SERVER")) {
            IComputer c = new Server(cpu, ram, hdd);
            computers.add(c);
            return c;
        }
        if (type.equals("DESKTOP")) {
            IComputer c = new Desktop(cpu, ram, 250);
            computers.add(c);
            return c;
        }
        return null;
    }

    public static Factory getInstance() {
        if (Factory.INSTANCE == null) {
            Factory.INSTANCE = new Factory();
        }
        return Factory.INSTANCE;
    }
}
