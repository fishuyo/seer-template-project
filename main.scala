

package com.fishuyo.seer
package template

import graphics._

object Main extends SeerApp {

	val cube = Cube()

	override def draw(){
		cube.draw()
	}
	override def animate(dt:Float){
		cube.rotate(0,.01f,0)
	}

}