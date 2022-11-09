package src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();

    public HealthcareWorkerTeam() {
    }

    public void addMember(HealthcareServiceable healthcareServiceable) {
        this.members.add(healthcareServiceable);
    }

    public void removeMember(HealthcareServiceable healthcareServiceable) {
        this.members.remove(healthcareServiceable);

    }

    @Override
    public void service() {
        Iterator<HealthcareServiceable> itr = this.members.iterator();
        while (itr.hasNext()) {
            itr.next().service();
        }
    }

    @Override
    public double getPrice() {
        Iterator<HealthcareServiceable> itr = this.members.iterator();
        double totalPrice = 0;
        while (itr.hasNext()) {
            totalPrice += itr.next().getPrice();
        }
        return totalPrice;

    }

}
