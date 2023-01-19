class demoswaping {
    public void swap(int a, int b) {
        System.out.println("before swap");
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after the swap");
        System.out.println(a + " " + b);

    }

    // public void swaps()
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        System.out.println("in main " + a + " " + b);
        demoswaping obj = new demoswaping();
        obj.swap(a, b);

        System.out.println("in main after swap : " + a + " " + b);

    }
}
