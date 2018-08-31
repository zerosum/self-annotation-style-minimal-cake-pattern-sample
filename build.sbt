name := "self-annotation-style-minimal-cake-pattern-sample"

scalaVersion := "2.12.6"

Compile / mainClass := Some("Main")

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "org.scalamock" %% "scalamock" % "4.1.0" % Test
)

