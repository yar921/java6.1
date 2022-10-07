public class RangeOfNumbers {
    public int calculate(int from, int before) {
        int numberOfOccurences = 0;

        for (; from < before; from++) {
            for (int z = 9; z < 99; z++) {
                if (z * z == from) {
                    numberOfOccurences++;
                    System.out.println(numberOfOccurences);
                }
            }
        }
        return numberOfOccurences;
    }
}

