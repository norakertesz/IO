public class WhileSchleife {

    public static void main(String[] args) {
        int counter = 0;
        while (true) {
            System.out.println("ich kann zaehlen:" + counter++);
            if (counter > 100) {
                continue;
            } else {
                break;
            }
        }
int [] myArray={1,2,3,4,5};
        for (int element:myArray) {
            System.out.println(element);
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray["+i+"] :"+myArray[i]);
        }
    }
}
