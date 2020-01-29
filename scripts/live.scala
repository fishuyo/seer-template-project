
class CubeStack extends SeerActor {

	val n = 30
	val s = 1.0f / n

	val cubes = for(i <- 0 until n) yield { 
		val c = Cube().scale(1,s,1).translate(0,i*s - .5f,0)
		c.material = Material.specular
		c.material.color = HSV(i*s,0.7f,0.7f)
		c
	}

	override def draw(){
		FPS.print
		cubes.foreach( _.draw )
	}
	override def animate(dt:Float){
		cubes.zipWithIndex.foreach {
			case(c,i)	=> 
				val speed = (Mouse.x.now() * 2 - 1) * 10
				c.rotate(0,(i+1)*s/100 * speed,0)
		}
	}

}

classOf[CubeStack]