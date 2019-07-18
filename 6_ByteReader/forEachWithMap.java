public static main forEachWithMap() {

 // Before Java 8, how to loop map
 final Map<Integer, Person> map = new HashMap<>();
 map.put(1, new Person(100, "Ramesh"));
 map.put(2, new Person(100, "Ram"));
 map.put(3, new Person(100, "Prakash"));
 map.put(4, new Person(100, "Amir"));
 map.put(5, new Person(100, "Sharuk"));

 for (final Entry<Integer, Person> entry : map.entrySet()) {
  System.out.println(entry.getKey());
  System.out.println(entry.getValue().getName());
 }
}