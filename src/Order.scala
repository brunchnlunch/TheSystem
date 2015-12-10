//Fix dates!


//items is a map from item ID to required quantity
case class Order (ID: Int, items: Map[Int , Int], datePlaced: String, isCompleted : Boolean, isAssigned : Boolean) {
}


object OrderList {
  var Orders = Set(new Order(1111, Map(102 -> 2), "a", true, true), new Order(1112, Map(100 -> 1, 101 -> 1), "b", false, true), new Order(1113, Map(103 -> 5), "c", false, false))
  
  def printOrder (ID : Int) {
      println("ID: " + ID)
      println("Items: ")
      var order : Order = null
      for (a <- Orders){
        if (ID == a.ID) {
          order = a
        }
      }
      for (b <- order.items.keys) {
        print(b)
        print("    ")
        print(StockList.findItemByID(b).name)
        print("   x   ")
        println(order.items(b))
      }
      println("Date order was placed: " + order.datePlaced)
      println("Has order been completed? " + order.isCompleted.toString)
      println("Has order been assigned? " + order.isAssigned.toString)
  }
}