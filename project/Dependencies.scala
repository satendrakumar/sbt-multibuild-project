import sbt._

object Dependencies {

  def compile   (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "compile")
  def provided  (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "provided")
  def test      (deps: ModuleID*): Seq[ModuleID] = deps map (_ % "test")


  val akkaVersion = "2.3.11"
  val sprayV = "1.3.3"
	
  val scalaTest =       "org.scalatest"                	%%      "scalatest"    	        %       "2.2.4"
  val typesafeConfig =	"com.typesafe"          	%       "config"                %   	"1.2.1"	
  val akkaActor =       "com.typesafe.akka"         	%%      "akka-actor"         	%       akkaVersion		
  val akkaRemote =      "com.typesafe.akka"         	%%      "akka-remote"         	%       akkaVersion		
  val akkaTestKit =     "com.typesafe.akka"         	%%      "akka-testkit"         	%       akkaVersion		
  val akkaKernel =      "com.typesafe.akka"         	%%      "akka-kernel"         	%       akkaVersion			
  val akkaSLF4J =       "com.typesafe.akka"         	%%      "akka-slf4j"         	%       akkaVersion
  val liftJson =        "net.liftweb"                	%%      "lift-json"         	%       "2.6"		
  val logback =         "ch.qos.logback"             	%       "logback-classic"     	%       "1.0.13"
  val scalaz =          "org.scalaz"                    %%      "scalaz-core"           %       "7.1.2"		
  val h2DB =            "com.h2database"             	% 	"h2"                    % 	"1.3.173"	
  val mail =            "javax.mail"                 	%       "mail"                 	%       "1.4.5"		
  val mysql =           "mysql"                      	%       "mysql-connector-java" 	%       "5.1.23"
  val mockito =  	"org.mockito" 			%       "mockito-core"          %      	"1.9.5"
  val sprayCan = 	 "io.spray"                   	%%  	"spray-can"             % 	 sprayV
  val sprayRouting =     "io.spray"                     %%      "spray-routing"         %        sprayV    
  val sprayTestkit=      "io.spray"                     %%      "spray-testkit"         %         sprayV
  val slick       =       "com.typesafe.slick"          %%      "slick"                 %         "3.0.0"

}

