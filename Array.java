class Array {
    public static void main(String args[]) {

        int a[] = {10, 20, 30, 40, 50};

        int min = a[0];
        int max = a[0];
        int sum = 0;

        for(int i = 0; i < a.length; i++) {

            if(a[i] < min) {
                min = a[i];
            }

            if(a[i] > max) {
                max = a[i];
            }

            sum = sum + a[i];
        }

        double avg = (double) sum / a.length;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);
    }
}