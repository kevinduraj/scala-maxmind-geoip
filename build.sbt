name := "scala-maxmind-geoip"

version := "1.0"

scalaVersion := "2.11.8"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.0"

libraryDependencies ++= Seq(
    "com.maxmind.geoip2" % "geoip2" % "2.9.0"
)
