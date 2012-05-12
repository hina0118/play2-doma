import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "sample"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    "play2-doma" % "play2-doma" % "1.0-SNAPSHOT"
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
    // Add your own project settings here
    resolvers += "Local Maven Repository" at "file:///C:/project/maven-repo/snapshots",
    playCompileEverything <<= playCompileEverything dependsOn SbtDomaPlugin.domaResourceCopy
  )

}
