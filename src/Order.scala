

class Order (IDi: Int, Items: Map[Item, Int], DatePlaced: String, IsCompleted : Boolean, IsAssigned : Boolean) {
    var ID = IDi
    var items = Items
    var datePlaced = DatePlaced
    var isCompleted = IsCompleted
    var isAssigned = IsAssigned
    
    def printOrder {
      println("ID: " + ID.toString)
      println("Items: ")
      for (a <- items.keys) {
        print(a.ID)
        print("    ")
        print(a.name)
        print("   x   ")
        println(items(a))
      }
      println("Date order was placed: " + datePlaced)
      println("Has order been completed? " + isCompleted.toString)
      println("Has order been assigned? " + isAssigned.toString)
    }
}