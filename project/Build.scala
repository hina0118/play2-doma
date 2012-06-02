import sbt._
import Keys._

object ModuleBuild extends Build {

  lazy val buildVersion  =  "1.0"
  lazy val playVersion   =  "2.0"

  lazy val moduleName    = "play2-doma"

  lazy val releases      = "C:/project/maven-repo/release"
  lazy val snapshot      = "C:/project/maven-repo/snapshots"
  lazy val repo          = if (buildVersion.endsWith("SNAPSHOT")) snapshot else releases

  lazy val play =  "play" %% "play" % playVersion

  lazy val root = Project(id = moduleName, base = file("."), settings = Project.defaultSettings).settings(
    version := buildVersion,
    publishTo := Some(Resolver.file("maven-repo", file(repo))),
    resolvers ++= Seq(
      "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
      "The Seasar Foundation Maven2 Repository" at "http://maven.seasar.org/maven2"
    ),
    javacOptions ++= Seq("-encoding", "utf8"),
    libraryDependencies += play,
    crossPaths := false,
    libraryDependencies += "org.seasar.doma" % "doma" % "1.22.0",
    libraryDependencies += "junit" % "junit" % "4.10",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.8"
  )
}
