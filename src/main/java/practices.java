public class practices {
    public static void main(String[] args) {
/*
        // long count1 = 1233434457879;    //  ✗ !!! COMPILE ERROR !!!
        long count2 = 1233434457879L;   //  ✓
        long count3 = 1233434457879l;   //  ✓

        //----------------------------------------

        // float number1 = 1.52;       //  ✗ !!! COMPILE ERROR !!!
        float number2 = 1.52F;      //  ✓
        float number3 = 1.52f;      //  ✓

        //---------------------------------------------


        Scanner input = new Scanner(System.in);

        System.out.println(input.next());

 */
        int[] array = {10, 4, 3, 50, 23, 90};
        largest(array);
    }

        public static void largest(int[] array){

            int smallest = Integer.MAX_VALUE;

            for (int i = 0; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }

            System.out.println( smallest );
        }


    }
