import sbt._
import Keys._
import com.typesafe.sbteclipse.plugin.EclipsePlugin._


object Parent extends Build{

  import BuildSettings._
  import Dependencies._


lazy val root = Project("my-project",file("."))
			.settings(buildSettings: _*)
			.settings(EclipseKeys.skipParents in ThisBuild := false)
			.settings(libraryDependencies ++=
      			   compile(sprayCan,sprayRouting,typesafeConfig,akkaActor,
                                         akkaRemote,akkaKernel,akkaSLF4J,liftJson,logback,slick,mysql,h2DB,mail,scalaz) )
			.dependsOn(core,restServices,common,dbService)
                       .aggregate(core,restServices,common,dbService)
			
lazy val core = Project("core",file("core"))
			.settings(buildSettings: _*)
			.settings(EclipseKeys.skipParents in ThisBuild := false)
			.settings(libraryDependencies ++= provided(scalaz,typesafeConfig,akkaActor,liftJson,akkaRemote,akkaKernel,akkaSLF4J) ++  test(scalaTest,akkaTestKit))
			.dependsOn(common)

lazy val common = Project("common", file("common"))
			.settings(buildSettings: _*)
			.settings(libraryDependencies ++=
      			provided(typesafeConfig,akkaActor,mail,logback,liftJson) ++ test(scalaTest,mockito)
    			)
    	
	


lazy val dbService = Project("dbservice",file("dbservice")) 
			.settings(buildSettings: _*)
			.settings(libraryDependencies ++=
      			provided(slick,mysql,h2DB,logback) ++  test(akkaTestKit,sprayTestkit)
    			)


 
lazy val restServices = Project("restservice",file("restservice")) 
			.settings(buildSettings: _*)
			.settings(libraryDependencies ++=
      			provided(liftJson,akkaActor,sprayCan,sprayRouting,logback) ++  test(akkaTestKit,sprayTestkit)
    			)



}

