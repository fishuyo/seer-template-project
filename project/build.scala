import sbt._

import Keys._


object TemplateBuild extends Build {

  lazy val sets = Settings.common ++ Seq(fork in Compile := true)

  lazy val project = SeerProject(
  	id = "template_project",
  	base = file("."),
  	settings = sets
  ) dependsOn( SeerBuild.seer_desktop, SeerBuild.seer_multitouch, SeerBuild.seer_eval )
  
}
