import java.util.Arrays;

public class Block {
    private int[] numbers;
    private  boolean[] order;

    public Block (int numNumbers){
        initNumbersArray(numNumbers);
        int cont = 0;
        while (cont < numbers.length){
            int randomNum = (int)(Math.random() * 49) + 1;

            if (!isRepeateNumbers(randomNum)){
                numbers[cont] = randomNum;
                cont++;
            }

        }
    }

    public Block (int... numbers) {
        this.numbers = numbers;
    }

    private boolean isRepeateNumbers(int number){
        for(int i = 0; i < numbers.length ; i++){
            if(number == numbers[i]){
                return true;
            }
        }
        return false;
    }

    public  void initNumbersArray (int numNumbers){
        if(numNumbers < 6){
            numNumbers = 6;
        }
        if(numNumbers > 49){
            numNumbers = 49;
        }
        numbers = new int[numNumbers];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = 0;
        }
    }

    @Override
    public String toString() {

        return Arrays.toString(numbers);
    }


}
