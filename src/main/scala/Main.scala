import org.jsoup.Jsoup

object Main extends App {

//  val doc = Jsoup.connect("https://hrmos.co/pages/shiftinc/jobs/0000134").get
//  println(doc)
//
//  println("********************")
//
//  val elements = doc.select(".pg-location-supplement")
//  println(elements)

  val doc = Jsoup.connect("https://callnavi.jp/secret/131").get
  println(doc)

  println("********************")

  val elements = doc.select("._item__txt--full")
  println(elements)

}
