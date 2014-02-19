import sbt._

import Keys._

// import org.scalasbt.androidplugin._
// import org.scalasbt.androidplugin.AndroidKeys._

object TemplateBuild extends Build {

  lazy val sets = Settings.common ++ Seq(fork in Compile := true)

  lazy val root = Project("root", file("."), settings = sets) dependsOn SeerBuild.seer_desktop
  
}
