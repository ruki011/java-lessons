package Semenar4;


public class Main {
    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;
        for(int i = 0; i<array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }
    public static <T> void fillUp(T[] objects, Function<Integer, ? extends T> function) {
        for(int i = 0; i < objects.length; i++){
            objects[i] = function.apply(i);
        }
    }
    public static void main (String[] args) {
        String array[] = new String[]{"2", "sfdf ", "Privetic", "22", null, "232"};
        String[] newArray =  (String[]) filter(array, new Filter() {
          @Override
            public boolean apply(Object obj) {
                return obj != null;
            }
        });
        for (int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
        Integer[] arrwithInt = new Integer[10];
        fillUp(arrwithInt, integ -> integ + integ);
        //Integer[] newArr = (Integer[]) filter(arrwithInt, new Filter() {
        for (int i = 0; i < arrwithInt.length; i++){
            System.out.println(arrwithInt[i]);
        }
        Integer[] newArr = (Integer[]) filter(arrwithInt, new Filter(){
            @Override
            public boolean apply(Object obj) {
                return false;
            }
        }
    }
}


