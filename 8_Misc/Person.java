class Person {
   //Fields
   String name;
   int age;
   
   //Constructor method
   Person(String name) {
      this.name = name;
      age = 0;
   }
   //Methods for class
   String getName() {
   return name;
   }

   void birthday() {
      age = age + 1;
      System.out.println("Happy birthday");
   }


} //End of class

