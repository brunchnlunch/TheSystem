import java.util.Date


//items is a map from item ID to required quantity
case class Order (ID: Int, items: Map[Int , Int], datePlaced: Date, isCompleted : Boolean, isAssigned : Boolean) {
}


object OrderList {
  var Orders = Set(new Order(1111, Map(102 -> 2), new Date(93,0,28), true, true), new Order(1112, Map(100 -> 1, 101 -> 1), new Date(115,0,28), false, true), new Order(1113, Map(103 -> 5), new Date(115,2,28), false, false))
  
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
      println("Date order was placed: " + order.datePlaced.toString)
      println("Has order been completed? " + order.isCompleted.toString)
      println("Has order been assigned? " + order.isAssigned.toString)
  }
  
  def findNonAssignedOrder : Int = {
    var ID = 0
    for (a <- Orders) {
      if (a.isAssigned == false) {
        ID = a.ID
      }
    }
    ID
  }
  
  def findOrderByID (ID : Int) : Order = {
    var order : Order = null
    for (a <- Orders) {
      if (ID == a.ID) {
        order = a
      }
    }
    order
  }
}