
package hashmap;



public class HashMap {

   
    public static void main(String[] args) {
        
        HashMap<String , Integer> vechiles=    new HashMap() ;
        vechiles.put("BMW", 5);
        vechiles.put("Merceds", 3);
        vechiles.put("Audi", 4);
        vechiles.put("Frod", 10);
        System.out.println("Total vechiles: " +vechiles.size());
        for(String key:  vechiles.keySet())

            System.out.println(key + " - " +  vechiles.get(key));

        System.out.println();

         

        String searchKey = "Audi";

        if( vechiles.containsKey(searchKey))

            System.out.println("Found total " + vechiles.get(searchKey) + " "+ searchKey + " cars!\n");
      
         vechiles.clear();
        System.out.println("After clear operation, size: " +  vechiles.size()); 
    }
}
