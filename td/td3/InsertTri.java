public class InsertTri implements SortAlgorithm {

    public InsertTri(){}

    public String[] sort(String[] unsorted){
        for (int i = 1; i < unsorted.length; i++) {
            String v = unsorted[i];
            int j = i;
            while (j-1 >= 0 && unsorted[j-1].compareTo(v) > 0){
                unsorted[j] = unsorted[j-1];
                j--;
            }
            unsorted[j] = v;
        }

        return unsorted;
    }

    public String name(){
        return "InsertTri";
    }

}