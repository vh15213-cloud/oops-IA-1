class InvalidWarrantyPeriodException extends Exception {
    InvalidWarrantyPeriodException(String message) {
        super(message);
    }
}

public class ProblemC {

    static void checkWarrantyPeriod(int warrantyPeriod)
            throws InvalidWarrantyPeriodException {

        if (warrantyPeriod < 0) {
            throw new InvalidWarrantyPeriodException(
                    "Warranty period cannot be negative."
            );
        }

        System.out.println(
                "Valid warranty period: " + warrantyPeriod + " years."
        );
    }

    public static void main(String[] args) {

        int warrantyPeriod = -2;

        try {
            checkWarrantyPeriod(warrantyPeriod);
        } catch (InvalidWarrantyPeriodException e) {
            System.out.println(
                    "InvalidWarrantyPeriodException handled: "
                            + e.getMessage()
            );
        }
    }
}