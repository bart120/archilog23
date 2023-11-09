package facto;

import java.util.ArrayList;
import java.util.List;

public class Factory {
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
        if (type.equals("DESCKTOP")) {
            IComputer c = new Desktop(cpu, ram, 250);
            computers.add(c);
            return c;
        }
        return null;
    }
}
