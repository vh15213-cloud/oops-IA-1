abstract class Warranty {
    abstract void claimWarranty();
}

class ExtendedWarranty extends Warranty {
    int warrantyPeriod;

    ExtendedWarranty(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void claimWarranty() {
        System.out.println("Extended warranty claimed for "
                + warrantyPeriod + " years.");
    }
}

public class ProblemB {
    public static void main(String[] args) {
        ExtendedWarranty warranty = new ExtendedWarranty(3);

        warranty.claimWarranty();
    }
}