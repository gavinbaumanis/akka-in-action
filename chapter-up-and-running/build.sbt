enablePlugins(JavaServerAppPackaging) //<co id="example-enable-sbt-native-packager"/>

name := "goticks"

version := "1.0"

organization := "com.goticks" //<co id="example-app-info"/>

// Dependency Library locations
resolvers ++= Seq(
    "Typesafe repository releases" at "https://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= {
  val akkaVersion       = "2.6.0-RC1" //<co id="akkaVersion"/>
  val akkaHttpVersion   = "10.1.10"

  Seq(
    "com.typesafe.akka" %% "akka-actor"      % akkaVersion, //<co id="actorDep"/>
    // Akka Libraries
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-remote" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
    
    // Akka HTTP
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,

    "ch.qos.logback"    %  "logback-classic" % "1.1.3",
    "org.scalatest"     %% "scalatest"       % "3.0.8"       % "test"    
  )
}
