import java.util.ArrayList;

public class SortBenchmark {

    public SortBenchmark(){}
    
    HashMap<String,SortAlgorithm> sorts = new HashMap<String,SortAlgorithm>();

    public void addAlgorithm(String key, SortAlgorithm sortToAdd){
        sorts.put(sortToAdd.name(),sortToAdd);
    }

    public void bench(){
        String[] unsorted = new String[10000];
        for (i=0; i < 10000; i++){
            unsorted[i] = RandomStringUtils.random(5,true,false);
        }

        for (SortAlgorithm e : sorts){
            System.out.println("BENCHMARK: " + e.name());
            

            Date d = new Date();
            long start = d.getTime();
            e.sort(unsorted);

            long end = d.getTime();

            System.out.println("BENCHMARK TIME: " + (end - start) );
        }
    }
}