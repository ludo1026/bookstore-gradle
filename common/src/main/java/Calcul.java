public class Calcul {

    public int sum(Integer... numbers) {
        Integer sum = 0;
        for(Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

}