class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int multipleofboth = 0;
        while (i < 1000) {
            boolean multiple3 = i % 3 == 0;
            boolean multiple5 = i % 5 == 0;
            if (multiple3 && multiple5) {
                 multipleofboth++;
            }
            i++;
        }
        System.out.println(multipleofboth);
    }
}


