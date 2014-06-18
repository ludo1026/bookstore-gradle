/**
 * Created by luchabou on 16/06/2014.
 */
public class CalculController {

    private Calcul calcul = new Calcul();

    public Integer calcul(Integer... numbers) {
        return calcul.sum(numbers);
    }

}
