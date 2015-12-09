

class Item (IDi: Int, Name: String, Quantity: Int, Volume: Int, Location: Int) {
  var ID = IDi
  var name = Name
  var quantity = Quantity
  var volume = Volume
  var location = Location
  
  def increaseQuantity(a : Int) {
    quantity += a
  }
}