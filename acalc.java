class acalc extends calc {
    int a;
    int b;
    double d;

    acalc(int a, int b) {
        super(a, b); // Call to superclass constructor
        this.a = a;
        this.b = b;
    }

    public double div() {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0; // or throw an exception
        }
        d = (double) x / y; // Use x and y from superclass
        return d;
    }

    public static void main(String[] args) {
        acalc c1 = new acalc(20, 5);
        System.out.println("Addition: " + c1.add());
        System.out.println("Subtraction: " + c1.diff());
        System.out.println("Multiplication: " + c1.mul());
        System.out.println("Division: " + c1.div());
    }
}
