name := "hello-world-scala"

version := "0.1"

scalaVersion := "2.12.6"

mainClass in Compile := Some("hello.Hello")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
