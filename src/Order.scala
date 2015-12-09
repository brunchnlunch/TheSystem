

class Order (IDi: Int, Items: Map[Item, Int], DatePlaced: String, IsCompleted : Boolean, IsAssigned : Boolean) {
    var ID = IDi
    var items = Items
    var datePlaced = DatePlaced
    var isCompleted = IsCompleted
    var isAssigned = IsAssigned
}