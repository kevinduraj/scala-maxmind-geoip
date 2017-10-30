package kduraj
import com.maxmind.geoip2.DatabaseReader
import com.maxmind.geoip2.model.CityResponse
import com.maxmind.geoip2.record.City
import com.maxmind.geoip2.record.Postal
import com.maxmind.geoip2.record.Subdivision
import java.net.InetAddress
import java.io.File

object Application {

    def main(args: Array[String]): Unit = {

        println("------ Scala GeoIP2 Lookup ------")
        maxmind_geoip2("69.13.39.39")
    }

    def maxmind_geoip2(IP: String): Unit = {

        val database = new File("/tmp/GeoLite2-City.mmdb")

        // This creates the DatabaseReader object, which should be reused across lookups.
        val reader = new DatabaseReader.Builder(database).build
        val ipAddress = InetAddress.getByName(IP)

        // Replace "city" with the appropriate method for your database, e.g., "country".
        val response = reader.city(ipAddress)

        val country = response.getCountry
        println("getIsoCode    : " + country.getIsoCode)
        println("getName       : " + country.getName)
        println("getConfidence : " + country.getConfidence)
        //println(country.getNames.get("zh-CN"))   // '美国'


        val subdivision = response.getMostSpecificSubdivision
        println("getName       : " + subdivision.getName)
        println("getIsoCode    : " + subdivision.getIsoCode)


        val city = response.getCity
        println("getName       : " + city.getName)

        val postal = response.getPostal
        println("getCode       : " + postal.getCode)


        val location = response.getLocation
        println("Latitude      : "  + location.getLatitude)
        println("Longitude     : "  + location.getLongitude)
        println("MetroCode     : "  + location.getMetroCode)
        println("TimeZone      : "  + location.getTimeZone)
        println("AverageIncome : "  + location.getAverageIncome)


    }
}
