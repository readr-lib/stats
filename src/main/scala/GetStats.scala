import com.readr.client._
import com.readr.client.document._
import com.readr.model._

object GetStats {
  val host = "http://localhost:9000"
  val ns = "raphaelhoffmann"
  val proj = "cytora"
  
  def main(args:Array[String]) = {
    implicit val p = Project("raphaelhoffmann", "cytora")
    Client.baseUrl = host + "/api"
    Client.open(host, "","")

    val first = documents.first(p, TextLayerRef(layerDefaults("Text")))

    println(first)

    Client.close
  }
}
