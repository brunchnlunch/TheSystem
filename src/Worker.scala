import scala.collection.mutable.ArrayBuffer   //mutable arrays

class Worker (IDi: Int, Name: String, ClockIn: ArrayBuffer[String], ClockOut: ArrayBuffer[String]){ //is forklift qualified? has order assigned?
  var ID = IDi
  var name = Name
  var clockIn = ClockIn
  var clockOut = ClockOut
  
  def clockIn(date : String){
    clockIn += date
  }
  
  def clockOut(date : String){
    clockOut += date
  }
  
  def isAtWork : Boolean = {   //only works if you get actual dates rather than strings
    if (clockIn.reverse.head > clockOut.reverse.head){      //compares which date is most recent
      true
    } else {
      false
    }
  }
}