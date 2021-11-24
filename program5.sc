object ExampleVarDecAndAssin {
   def main(args: Array[String]) {
      
      var (name: String, age: Int) = Pair("Michael",42);
      println("Name:   "+name);
      println("Age:    "+age);
   
      var (address,mobile)=Pair(“St. Paul, MN",1234567890);     
      
      println("Address:   "+address);
      println("Mobile:    "+mobile);      
            
   }
}
