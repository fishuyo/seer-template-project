import sbt._

import Keys._


object TemplateBuild extends Build {

  lazy val project = SeerProject(
  	id = "template_project",
  	base = file("."),
  	settings = BuildSettings.app
  ) dependsOn( SeerBuild.seer_desktop, SeerBuild.seer_multitouch, SeerBuild.seer_eval )
  
}
