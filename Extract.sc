import collection.JavaConverters._
import scala.language.postfixOps
import java.io.File
import java.time.LocalDateTime
import $ivy.`org.jsoup:jsoup:1.13.1`, org.jsoup._
import $ivy.`com.github.tototoshi::scala-csv:1.3.10`, com.github.tototoshi.csv._

object Extract {
  def get = {
    for (row <- (Jsoup connect "https://www.iban.com/currency-codes" get)
      select "table tbody" select "tr" asScala
    ) yield (
      row select "td" asScala
    ).map(_.text)
  }

  def toCsv = {
    val FILENAME = s"${LocalDateTime.now}-IBANCcMap.csv"
    val outFile = new File(FILENAME)
    val writer = CSVWriter.open(outFile)
    // Header
    writer.writeRow(List("Country", "Currency", "CountryCode", "CountryNumberCode"))
    get.foreach(r => writer.writeRow(r.toList))
  }
}
