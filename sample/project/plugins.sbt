// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.0.1")

resolvers += "Local Maven Repository" at "file:///C:/project/maven-repo/snapshots"

addSbtPlugin("sbt-doma-plugin" % "sbt-doma-plugin" % "1.0-SNAPSHOT")