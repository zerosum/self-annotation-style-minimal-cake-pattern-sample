name := "self-annotation-style-minimal-cake-pattern-sample"

ThisBuild / scalaVersion := "2.12.6"

lazy val domain = project

lazy val persistence = project.dependsOn(domain)

lazy val presentation = project.dependsOn(domain, persistence)
