import scala.collection.mutable.ArrayBuffer   //mutable arrays

class OrderList ( args : Order*) {     //Pass a variable number of constructors in
  
  var orderList = ArrayBuffer.empty[Order]
  for(a <- args){     //adds each order passed into object into the var orderList
    orderList += a
  }

  def findNonAssignedOrder : Order = {                    //If no non-assigned orders left returns null
    var a = orderList.find( _.isAssigned == false)
    var b = a.getOrElse(null)
    b
  }
  
  def findOrderByNumber ( itemNumber : Int ) : Order = {
        var a = orderList.find( _.ID == itemNumber)
        var b = a.getOrElse(null)
        b
  }
}