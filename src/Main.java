public class Main {
    public static void main(String[] args) {
                int[] array = {23,534,5,345,235,54365};
                int max = array[0];
                int index = 0;

                for (int i = 1; i < array.length ; i++) {
                    if(array[i] > max){
                        max = array[i];
                        index = i;
                    }
                }
                System.out.println(max);
                System.out.println(index);
            }
        }


