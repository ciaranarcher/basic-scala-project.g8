name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

