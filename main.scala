package com.fishuyo.seer
package template

import dynamic._

object Main extends SeerApp {

  // Compiles and reloads live.scala on save
  val live = ScriptManager.load("scripts/live.scala")

  override def draw() {}
  override def animate(dt: Float) {}
}
