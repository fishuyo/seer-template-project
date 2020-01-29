excludeFilter in unmanagedSources := "live.scala"

/*
 * Seer Modules - Project Refs
 */
val app = ProjectRef(file("seer"), "gdx_app_desktop")
val script = ProjectRef(file("seer"), "script")

/*
 * template project
 */
val template =
  project.in(file(".")).dependsOn(app, script).settings(Common.appSettings: _*)
