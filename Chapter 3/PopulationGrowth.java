public class PopulationGrowth {
    public static void main(String[] args) {
        double population = 8100000000.0, rate = 0.009, initial = population;
        int doubleYear = -1;
        
        System.out.printf("%-5s\t%-25s\t%-20s%n", "Year", "Population", "Numerical Increase");
        for (int y = 1; y <= 75; y++) {
            double growth = population * rate;
            population += growth;
            System.out.printf("%-5d\t%-25.0f\t%-20.0f%n", y, population, growth);
            if (doubleYear == -1 && population >= (2 * initial)) {
                doubleYear = y;
            }
        }
        if (doubleYear != -1) System.out.printf("Doubles in year: %d%n", doubleYear);
    }
}