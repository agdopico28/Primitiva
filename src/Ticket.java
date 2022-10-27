import java.util.Arrays;

public class Ticket {
    private Block[] blocks;

    public Ticket(int numBlocks){
        blocks = new Block[ numBlocks];
        for(int i = 0; i < blocks.length; i++){
            blocks[i] = new Block(6);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < blocks.length; i++){
            s +=blocks[i] + "\n";

        }
        return  s ;
    }

    public void printUsedNumbers(){
        boolean[] usedNumbers = new boolean[50];
        for (int i = 0 ; i < usedNumbers.length; i++){
            usedNumbers[i] = false;
        }

        for (int i = 0; i < blocks.length; i++){
            int[] numbers = blocks[i].getNumbers();
            for(int j = 0; j < numbers.length; j++){
                int indexToCheck = numbers[j];
                usedNumbers[numbers[j]] = true;
            }
        }

        boolean addComa = false;
        for (int i = 0; i < usedNumbers.length; i++){
            if (usedNumbers[i] == true){
                if(!addComa){
                    System.out.print(i );
                    addComa = true;
                }else{
                    System.out.print(", " + i);
                }

            }

        }
    }
}
