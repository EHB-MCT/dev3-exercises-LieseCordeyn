import java.sql.*
import java.util.*

fun main(){
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

  // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword

// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    println("Waar wil je naartoe?")
    val city = readLine()

   //test data ophalen
    val statement = connection.prepareStatement("SELECT * FROM 6_rides" + " " +
            "LEFT JOIN 6_trains ON 6_trains.id = 6_rides.id_train" + " " +
            "LEFT JOIN 6_cities ON 6_cities.id = 6_rides.arrival_city_id" + " " +
            "WHERE city_name = '$city' LIMIT 1")
    val result = statement.executeQuery()

    while(result.next()) {
        println( "Naar:" + result.getString("city_name"))
        println( "Om:" + result.getString("departure_time"))
        println("Met:" + result.getString("name"))
    }



}