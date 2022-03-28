public class Main {
    public static void main(String[] args){
        RandomCharacter random = new RandomCharacter();
        System.out.print("\nRandom Lower Case Letter : ");
        for (int i = 0; i < 15; i++){
            System.out.print(random.getRandomLowerCaseLetter()+" ");
        }

        System.out.print("\nRandom Upper Case Letter : ");
        for (int i = 0; i < 15; i++){
            System.out.print(random.getRandomUpperCaseLetter()+" ");
        }

        System.out.print("\nRandom Digit Letter : ");
        for (int i = 0; i < 15; i++){
            System.out.print((int)random.getRandomDigitCharacter()+" ");
        }


        System.out.print("\nRandom Character : ");
        for (int i = 0; i < 15; i++){
            System.out.print((char)random.getRandomCharacter()+" ");
        }


        System.out.print("\nRandom Prime Number : ");
        for (int i = 0; i < 15; i++){
            System.out.print((int)random.getRandomPrimeNumber()+" ");
        }
    }
}