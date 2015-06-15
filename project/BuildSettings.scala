import sbt._
import Keys._
import com.typesafe.sbteclipse.plugin.EclipsePlugin._

object BuildSettings {
  val buildSettings =  Defaults.defaultSettings    ++ 
 	Seq(
    	organization 			:= 	"com.knol",
    	version 			:= 	"1.0.0",
    	scalaVersion 			:= 	"2.11.6",
	parallelExecution in Test	:= 	false,
	EclipseKeys.createSrc 		:= 	EclipseCreateSrc.Default + EclipseCreateSrc.Resource,
	fork in Test 			:=	true
						)
}
